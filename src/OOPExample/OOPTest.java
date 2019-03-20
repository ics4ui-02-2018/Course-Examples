/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOPExample;

/**
 *
 * @author lamon
 */
public class OOPTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student[] classroom = new Student[30];
        
        Student s1 = new Student("Steve", 007, 10);
        Student s2 = new Student("Doris", 1337, 11);
        Student s3 = new Student("Patrick", 2, -2);
        System.out.println(s1.getName());
        System.out.println(s2.getName());
        s3.speak();
        s2.speak();
        s1.speak();
        
        System.out.println(s1);
        
    }
    
}
