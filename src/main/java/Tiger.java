/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Tiger extends Animal {
    
    private int numberOfStripes;

    public Tiger(int numberOfStripes, String speciesName) {
        super(speciesName);
        this.numberOfStripes = numberOfStripes;
    }

    public int getNumberOfStripes() {
        return numberOfStripes;
    }

    public void setNumberOfStripes(int numberOfStripes) {
        this.numberOfStripes = numberOfStripes;
    }

    @Override
    public String toString() {
        return "Tiger{speciesName="+this.getSpeciesName() +  ",numberOfStripes=" + numberOfStripes + '}';
    }
    
    
    
}
