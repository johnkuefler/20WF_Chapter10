/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Pairot extends Animal {

    private double wingSpan;

    public Pairot(double wingSpan, String speciesName) {
        super(speciesName);
        this.wingSpan = wingSpan;
    }
    
    public double getWingSpan() {
        return wingSpan;
    }

    public void setWingSpan(double wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public void makeASound() {
        System.out.println("The pairot squawked, ");
    }
    
    @Override
    public String toString() {
        return "Pairot{speciesName=" + this.getSpeciesName() + ",wingSpan=" + wingSpan + '}';
    }

}
