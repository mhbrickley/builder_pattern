package edu.bu.met.cs665;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import edu.bu.met.cs665.builder.Suit;
import edu.bu.met.cs665.builder.SuitBuilder;

public class TestSuit {

  // instantiate blue suit object
  Suit blueSuit = null;
  // instantiate brown suit object
  Suit brownSuit = null;

  
  @Before
  // initialize
  public void setup() {
    
    // create SuitBuilder object (Singleton)
    SuitBuilder sb = SuitBuilder.getInstance();

    // build blue suit
    blueSuit = sb.buildBlueSuit();
    
    // build blue suit
    brownSuit = sb.buildBrownSuit();

  }
  
  @Test
  public void testSuitPrice() {
    
    //***BLUE SUIT***//
    /*
     * Blue suit has the following specifications:
     * Size 10 shoes = 10 x $1.50 = $15
     * Size 35 pants = 35 x $2.00 = $70
     * Size 15 shirt = 15 x $1.50 = $22.50
     * Size 40 jacket = 40 x $1.50 = $60
     * 
     * So total should be $167.50 
     */
    
    // confirm total
    assertTrue(blueSuit.getSuitCost() == 167.50);
    
    
    //***BROWN SUIT***//
    /*
     * Brown suit has the following specifications:
     * Size 15 shoes = 15 x $2.00 = $30
     * Size 38 pants = 38 x $2.00 = $76
     * Size 18 shirt = 18 x $2.00 = $36
     * Size 60 jacket = 60 x $2.00 = $120
     * 
     * Extra $10 for tie option
     * Extra $5 for shoe shine option
     * 
     * So total should be $277.00 
     */
    
    // confirm total
    assertTrue(brownSuit.getSuitCost() == 277.00);
  
    
  }
  
  
  @Test
  public void testOrderFulfillment() {
   
    // blue suit is < $200, so order should be fulfilled in store
    assertEquals(blueSuit.getOrderType().getClass().getSimpleName(),"StoreOrder");
   
    // brown suit is > $200, so order should be fulfilled by warehouse
    assertEquals(brownSuit.getOrderType().getClass().getSimpleName(),"WarehouseOrder");
    
  }
  
  

}
