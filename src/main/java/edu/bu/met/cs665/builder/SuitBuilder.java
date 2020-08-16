package edu.bu.met.cs665.builder;

import edu.bu.met.cs665.decorator.*;
import edu.bu.met.cs665.suit.*;
import org.apache.log4j.Logger;

public class SuitBuilder {
  
  // create Logger object for method calls below
  private static Logger log = Logger.getLogger(SuitBuilder.class);
  
  

  /***SINGLETON PATTERN***/
  // create an object of SingleObject
  private static SuitBuilder instance = new SuitBuilder();

  // make the constructor private so that this class cannot be
  // instantiated
  private SuitBuilder() {
  }

  // Get the only object available
  public static SuitBuilder getInstance() {
    log.debug("SuitBuilder: Singleton SuitBuilder object being generated");
    return instance;
  }

  
  
  /***DIFFERENT SUIT BUILDS BELOW...***/

  /**
   * Builds a blue suit via Builder Pattern.
   * No decorators implemented.
   * @return suit object with specified pieces 
   */
  public Suit buildBlueSuit() {

    // create suit object
    Suit blueSuit = new Suit();

    // add pieces to suit
    blueSuit.addSuitPiece(new Loafer("Brown", 10));
    blueSuit.addSuitPiece(new Pleated("Blue", 35));
    blueSuit.addSuitPiece(new StripedShirt("White", 15));
    blueSuit.addSuitPiece(new SolidJacket("Blue", 40));
    
    log.debug("SuitBuilder: Blue suit created");
    return blueSuit;

  }

  
  /**
   * Builds a black suit via Builder Pattern.
   * ShoeShine decorator option implemented.
   * @return suit object with specified pieces 
   */
  public Suit buildBlackSuit() {

    // create suit object
    Suit blackSuit = new Suit();

    // add pieces to suit
    blackSuit.addSuitPiece(new ShoeShine(new Oxford("Black", 10)));
    blackSuit.addSuitPiece(new FlatFront("Black", 28));
    blackSuit.addSuitPiece(new SolidShirt("White", 13));
    blackSuit.addSuitPiece(new SolidJacket("Black", 55));

    log.debug("SuitBuilder: Black suit (with shoe shine option) created");
    return blackSuit;

  }

  
  /**
   * Builds a brown suit via Builder Pattern.
   * ShoeShine decorator option and Tie decorator option implemented.
   * @return suit object with specified pieces 
   */
  public Suit buildBrownSuit() {

    // create suit object
    Suit brownSuit = new Suit();

    // add pieces to suit
    brownSuit.addSuitPiece(new ShoeShine(new Oxford("Brown", 15)));
    brownSuit.addSuitPiece(new Pleated("Brown", 38));
    brownSuit.addSuitPiece(new Tie(new SolidShirt("Blue", 18)));
    brownSuit.addSuitPiece(new StripedJacket("Brown", 60));

    log.debug("SuitBuilder: Brown suit (with shoe shine option and tie option) created");
    return brownSuit;

  }

}
