/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExample;

/**
 *
 * @author lamon
 */
public abstract class Pet {
    
    private String name;
    private int age;
    private String description;
    
    public Pet(String name, int age, String description){
        this.name = name;
        this.age = age;
        this.description = description;
    }
    
    public abstract void speak();
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public String toString(){
        String output = this.name + "\n";
        output = output + "Age: " + this.age + "\n";
        output = output + "Desc: " + this.description;
        return output;
    }
    
}
