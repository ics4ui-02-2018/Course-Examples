/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author lamon
 */
public class Recursion {

    public static int fibLoop(int n){
        // creating an array to store possible values
        int[] nums = new int[n+1];
        // set the starting values
        nums[0] = 1;
        nums[1] = 1;
        // build the rest of the values
        for(int i = 2; i <= n; i++){
            // Fibbonacci definition
            nums[i] = nums[i-1] + nums[i-2];
        }
        // return the answer
        return nums[n];
        
    }
    
    
    public static int fibRec(int n){
        // base case
        if(n == 0 || n == 1){
            return 1;
        }
        // recursive call
        return fibRec(n-1) + fibRec(n-2);
        
    }
    
    
    public static int gcd(int a, int b){
        // base case
        if(b == 0){
            return a;
        }
        // do Euclidean Algorithm
        return gcd(b, a%b);
    }
    
    
    public static int fact(int n){
        // base case
        if(n == 1 || n == 0){
            return 1;
        }
        return n * fact(n-1);
    }
    
    
    public static int pies(int[] sugar, int sugarEaten){
        // base case, no pies, done eating
        if(sugar.length == 0){
            // nothing to eat
            return sugarEaten;
        }else if (sugar.length == 1){
            // just eat the last one
            return sugarEaten + sugar[0];
        }
        
        // try eating the pie
        int newSugarEaten = sugarEaten + sugar[0];
        // remove appropriate pies
        int[] newPies = new int[sugar.length - 2];
        // copy old pies into new
        for(int i = 2; i < sugar.length; i++){
            newPies[i-2] = sugar[i];
        }
        // move to next pies
        int pieEaten = pies(newPies, newSugarEaten);
        
        // try don't eat the pie
        // no new sugar for me
        newSugarEaten = sugarEaten;
        // get this pie away from me
        newPies = new int[sugar.length - 1];
        // copy old pies
        for(int i = 1; i < sugar.length; i++){
            newPies[i-1] = sugar[i];
        }
        // move on
        int noPieEaten = pies(newPies, newSugarEaten);
        
        // return the biggest one
        return Math.max(pieEaten, noPieEaten);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // int fib5 = fibLoop(45);
       // System.out.println("F45 = " + fib5);
       
       //int gcd = gcd(36,8);
        //System.out.println(gcd);
       
        int[] pies = {12,15,2,10,11,10};
        int amount = pies(pies, 0);
        System.out.println(amount);
        
    }
    
}
