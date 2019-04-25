/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileReading;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lamon
 */
public class Library {
    private List<Book> books = new ArrayList<>();
    private List<LibraryMember> members = new ArrayList<>();
    
    
    public void addBook(String name, String author, int id){
        Book aBook = new Book(name, author, id);
        this.books.add(aBook);
    }
    
    public void addMember(String name, String address){
        LibraryMember member = new LibraryMember(name, address);
        this.members.add(member);
    }
    
    public Book findBook(int id){
        for(int i = 0; i < this.books.size(); i++){
            Book aBook = this.books.get(i);
            if(aBook.getIDNumber() == id){
                // book found
                return aBook;
            }
        }
        // no book found
        return null;
    }
    
    public LibraryMember findMember(String name){
        // enhanced for loop
        for(LibraryMember m: this.members){
            if(m.getName().equals(name)){
                // found member
                return m;
            }
        }
        // no member found
        return null;
    }
    
    public void checkoutBook(Book aBook, LibraryMember member){
        if(!member.hasABook() && !aBook.isOnLoan()){
            aBook.checkout();
            member.borrowBook(aBook);
        }
    }
    
    public void loadMembers(String filename){
        // load members in from a file
        try{
            Scanner input = new Scanner(new File(filename));
            // keep going until the end
            while(input.hasNext()){
                String name = input.nextLine();
                String address = input.nextLine();
                String onLoan = input.nextLine();
                // add the member
                addMember(name, address);
                
                if(!onLoan.equals("NONE")){
                    
                }
            }
        }catch(FileNotFoundException e){
            // print an error message
            System.err.println("File not found");
        }
    }
    
}
