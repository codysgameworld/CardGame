/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ca.sheridancollege.project;

/**
 *
 * @author yeli8
 */
public class Dealer extends Person {

    public Dealer(String name, Hand hand) {
        super(name, hand);
    }
    public void showFirstHand(){
        System.out.println(getName() + "'s Hand: " + "/n <hidden card>") ;
        System.out.println(getHand() + "'s hand valued at: ");
    }
}
