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
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fib5 = fibLoop(45);
        System.out.println("F45 = " + fib5);
    }
    
}
