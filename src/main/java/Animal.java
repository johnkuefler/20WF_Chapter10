/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Animal {
    private String speciesName;

    public Animal(String speciesName) {
        this.speciesName = speciesName;
    }
        
    public final String getSpeciesName() {
        return speciesName;
    }

    public final void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
    
    public void makeASound() {
        System.out.println("The animal made a sound");
    }

    @Override
    public String toString() {
        return "Animal{" + "speciesName=" + speciesName + '}';
    }
}
