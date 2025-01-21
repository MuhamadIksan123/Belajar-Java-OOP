package pzn.application;
 
import pzn.annotation.Fancy;
import pzn.data.*; 

@Fancy(name = "AnimalApp", tags = {"application", "java"})
public class AnimalApp {
    public static void main(String[] Args) {
        Animal animal = new Cat();
        animal.name = "Puss";
        animal.run();
        
    }
}
