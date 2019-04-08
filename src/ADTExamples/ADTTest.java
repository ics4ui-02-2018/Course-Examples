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
public class ADTTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyArrayList aList = new MyArrayList();
        aList.append(7);
        aList.append(-12);
        aList.insert(8,3);
        
        for(int i = 0; i < aList.size(); i++){
            System.out.println(aList.get(i));
        }
    }
    
}
