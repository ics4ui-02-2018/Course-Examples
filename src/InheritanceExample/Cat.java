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
public class Cat extends Pet {

    private int lives;

    public Cat(String name, int age, String description, int lives) {
        super(name, age, description);
        this.lives = lives;
    }
    
    public int getLives(){
        return this.lives;
    }
    
    public void speak(){
        System.out.println("MEEEOOOW");
    }
    
    public String toString(){
        String output = "CAT \n";
        output = output + super.toString();
        return output;
    }
}
