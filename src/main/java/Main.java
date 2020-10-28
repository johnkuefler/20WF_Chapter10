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
             
        Pairot myBird = new Pairot(20, "Pairot");
        System.out.println(myBird);
        myBird.makeASound();
        
        Tiger myTiger = new Tiger(5, "African Tiger");
        System.out.println(myTiger);
        myTiger.makeASound();

         
    }
}
