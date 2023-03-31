/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * A class that models each Player in the game. Players have an identifier, which should be unique.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author yeli March 2023
 * @author Cody Labelle
 * @author Sarah McCrie
 */
public class Player extends Person {

    private String name;
    Scanner scan = new Scanner(System.in);

    public Player() {
        super.setName("Player");
    }
    @Override
    public String getName() {
        return name;
    }
    
    
    @Override
    public void setName(String name) {
        this.name = name;
    }
    public void hitOrStand(Deck deck) {

        String decision = "";

        do{
            System.out.println("Would you like to: Hit(enter h) or Stand(enter s)");
            decision = scan.nextLine();
        } 
        while(!decision.toLowerCase().equals("h") && !decision.toLowerCase().equals("s"));
            
        if (decision.toLowerCase().equals("h")) {
            super.hit(deck);
            if(getHand().calculateValue()>20){
                return;
            }
            else{
                hitOrStand(deck);
            }
        } else {
            System.out.println("You stand.");
        }
    

    }
}