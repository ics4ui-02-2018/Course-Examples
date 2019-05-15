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
public class PetTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dog dog1 = new Dog("Spike", 3, "Black and White Boxer");
        Cat cat1 = new Cat("Fluffy", 5, "Orange Tabby w/ White Stripes", 7);
        
        dog1.speak();
        dog1.howl();
        System.out.println(dog1.getName());
        
        cat1.speak();
        System.out.println(cat1.getName());
        
        System.out.println("\n\n\n");
        System.out.println(cat1);
        System.out.println("\n\n\n");
    
        Saveable s = dog1;
        
        Pet[] zoo = new Pet[3];
        zoo[0] = new Dog("Rex", 8, "Black Lab");
        zoo[1] = new Cat("Garfield",4, "Orange Tabby", 2);
        zoo[2] = new Dog("Princess", 1, "Brown Chihuahua");
        
        // for each pet in the array
        for(Pet p: zoo){
            p.speak();
            // ask only the dogs to howl
            // check for a dog
            if(p instanceof Dog){
                // change the pet into a dog
                Dog d = (Dog)p;
                d.howl();
            }
        }
    }
    
}
