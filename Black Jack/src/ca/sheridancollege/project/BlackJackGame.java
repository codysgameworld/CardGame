/**
 * SYST 17796 Project Base code.
 * Students can modify and extend to implement their game.
 * Add your name as an author and the date!
 */
package ca.sheridancollege.project;

import java.util.Scanner;

/**
 * The class that models your game. You should create a more specific child of this class and instantiate the methods
 * given.
 *
 * @author dancye
 * @author Paul Bonenfant Jan 2020
 * @author yeli March 2023
 * @author Cody Labelle
 * @author Sarah McCrie
 */
public class BlackJackGame extends Game{

    private Deck deck = new Deck();
    private Dealer dealer = new Dealer();
    private Player player = new Player();

    private static BlackJackGame instance = null;

    private BlackJackGame(String name) {
       super(name);
    }

    public static BlackJackGame getInstance() {
        if (instance == null) {
            instance = new BlackJackGame("Black Jack");
        }
        return instance;
    }
    
    Scanner scan = new Scanner(System.in);
    public void play() {
        String input;
        do{
            System.out.println("Welcome to " + getName() + "! Press s to start the game.");
            input = scan.nextLine();
        }
        while(!input.toLowerCase().equals("s"));
        
            startRound();
            declareWinner();
        
    }
    
    public void startRound() {
        deck.createDeck();
        deck.shuffleDeck();

        //player gets 2 cards
        player.getHand().takeCardFromDeck(deck);
        player.getHand().takeCardFromDeck(deck);

        //dealer gets 2 cards
        dealer.getHand().takeCardFromDeck(deck);
        dealer.getHand().takeCardFromDeck(deck);

        dealer.showFirstHand();
        player.showHand();

        player.hitOrStand(deck);
    }
    
    public void declareWinner(){
        if(player.getHand().calculateValue() > 21) {
            System.out.println("You have bust. You lose.");
            return;
        }

        dealer.showHand();
        while(dealer.getHand().calculateValue() < 17) {
            dealer.hit(deck);
        }

        if(dealer.getHand().calculateValue() > 21) {
            System.out.println("Dealer busts. You win.");
        } else if(dealer.getHand().calculateValue() > player.getHand().calculateValue()) {
            System.out.println("You lose.");
        } else if(player.getHand().calculateValue() > dealer.getHand().calculateValue()) {
            System.out.println("You win.");
        } else {
            System.out.println("Push.");
        }
    }

  }


