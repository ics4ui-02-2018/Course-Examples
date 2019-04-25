/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReading;

/**
 *
 * @author lamon
 */
public class LibraryTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Library lib = new Library("books.txt", "members.txt");
        
        LibraryMember m = lib.findMember("Anne Sirs");
        if(m.hasABook()){
            Book aBook = m.getBook();
            System.out.println(aBook.getName());
        }
        
        lib.addMember("John Doe", "987 Some St");
        lib.saveMembers("members.txt");
    }
    
}
