/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ADTExamples;

/**
 *
 * @author lamon
 */
public class MyArrayList {
    private int[] list = new int[10];
    private int numItems = 0;
    
    public MyArrayList(){
        
    }
    
    // Adds an item to the end of the list
    // PRE: none
    // POST: num added to last position in the list
    public void append(int num){
        // are we free to add it in?
        if(numItems < this.list.length){
            // add it
            this.list[numItems] = num;
            // increase the count
            numItems++;
        }else{
            // its full, make it bigger
            makeArrayBigger();
            this.list[numItems]= num;
            numItems++;
        }
    }
    
    // Inserts the number into the specific list position
    // PRE: position has to exsist
    // POST: number added to the list
    public void insert(int position, int num){
        // make sure pre is met
        assert(position <= numItems);
        
        // check if no room left
        if(numItems == this.list.length){
            // make room
            makeArrayBigger();
        }
        // shuffle down
        for(int i = numItems; i > position; i--){
            this.list[i] = this.list[i-1];
        }
        this.list[position] = num;
        numItems++;
    }
    
    // Removes a num from the specified position
    // PRE: position is valid
    // POST: number is removed
    public void remove(int position){
        assert(position < numItems);
        for(int i = position; i < numItems - 1 ; i++){
            this.list[i] = this.list[i+1];
        }
        numItems--;
    }
    
    public int get(int position){
        assert(position < numItems);
        return this.list[position];
    }
    
    public boolean isEmpty(){
        return numItems == 0;
    }
    
    public int size(){
        return numItems;
    }
    
    private void makeArrayBigger(){
        // double the array
        int[] temp = new int[numItems*2];
        // copy everything across
        for(int i = 0; i < numItems; i++){
            temp[i] = list[i];
        }
        // set our list to be the temp
        this.list = temp;
    }
    
}
