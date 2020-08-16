package edu.bu.met.cs665;

import edu.bu.met.cs665.builder.Suit;
import edu.bu.met.cs665.builder.SuitBuilder;
import org.apache.log4j.Logger;

public class Main {

  /**
   * A main method to run examples.
   *
   * @param args not used
   */
  public static void main(String[] args) {
    
    //create logger object
    Logger log = Logger.getLogger(Main.class);
    
    // create SuitBuilder object (Singleton)
    SuitBuilder sb = SuitBuilder.getInstance();

    
    
    /***CREATE BLUE SUIT***/
    //create suit
    Suit blueSuit = sb.buildBlueSuit();

    //display suit pieces
    log.info("**Blue Suit**");
    log.info(blueSuit.showPieces());
    
    //display suit cost
    log.info("Suit cost: $" + blueSuit.getSuitCost());
    
    //determine ordering strategy
    log.info(blueSuit.getOrderType().orderChoice() + "\n");

    
    
    /***CREATE BLACK SUIT***/
    // create suit
    Suit blackSuit = sb.buildBlackSuit();

    //display suit pieces
    log.info("\n**Black Suit**");
    log.info(blackSuit.showPieces());

    //display suit cost
    log.info("Suit cost: $" + blackSuit.getSuitCost());
    
    //determine ordering strategy
    log.info(blackSuit.getOrderType().orderChoice() + "\n");
    
    
    
    /***CREATE BROWN SUIT***/
    // create suit
    Suit brownSuit = sb.buildBrownSuit();

    //display suit pieces
    log.info("\n**Brown Suit**");
    log.info(brownSuit.showPieces());

    //display suit cost
    log.info("Suit cost: $" + brownSuit.getSuitCost());
    
    //determine ordering strategy
    log.info(brownSuit.getOrderType().orderChoice() + "\n");
    

  }
}
