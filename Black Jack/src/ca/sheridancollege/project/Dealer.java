/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author yeli March 2023
 * @author Cody Labelle
 * @author Sarah McCrie
 */
public class Dealer extends Person {

    public Dealer() {
        super.setName("Dealer");;
    }
    public void showFirstHand(){
        System.out.println("Dealer's Hand:\n " + super.getHand().getCard(0) + "\n <hidden card>\n");
    }
}
