
import Logging.ConsoleLogger;
import Logging.FileLogger;
import Logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Main {
    public static void main(String[] args) {
        
         
             
        Logger logger = new FileLogger();
        
        logger.logInfo("Making a pairot");
        Pairot myBird = new Pairot(20, "Pairot");
        System.out.println(myBird);
        myBird.makeASound();
        
        logger.logInfo("Making a tiger");
        Tiger myTiger = new Tiger(5, "African Tiger");
        System.out.println(myTiger);
        myTiger.makeASound();

        logger.logWarning("Danger! Polymorphism!");
        MakeTheAnimalMakeASound(myTiger);
        MakeTheAnimalMakeASound(myBird);

        DoSomethingWithAPairot(myBird);
    }
    
    
    
    public static void MakeTheAnimalMakeASound(Animal myAnimal) {
        System.out.println("Here's the sound this animal of type: " 
                + myAnimal.getSpeciesName() + " makes");
        
        myAnimal.makeASound();
    }
    
    
    public static void DoSomethingWithAPairot(Pairot pairot) {
        System.out.println("Here's my pairot " + pairot.toString());
    }
    
}
