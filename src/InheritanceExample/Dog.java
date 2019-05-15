/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExample;

import java.io.Serializable;

/**
 *
 * @author lamon
 */
public class Dog extends Pet implements Saveable, Runnable, Serializable{
    
    public Dog(String name, int age, String description){
        super(name, age, description);
    }
    
    @Override
    public void speak(){
        System.out.println("WOOF WOOF");
    }
    
    public void howl(){
        System.out.println("HOOOOOOWLLLLLL");
    }

    

    @Override
    public void load() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
