package edu.bu.met.cs665.builder;


import edu.bu.met.cs665.factory.OrderFulfillment;
import edu.bu.met.cs665.factory.StoreOrder;
import edu.bu.met.cs665.factory.WarehouseOrder;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.Logger;

public class Suit {
  
  // create Logger object for method calls below
  private static Logger log = Logger.getLogger(Suit.class);
  
  
  // list of pieces within suit
  private List<SuitPiece> suitLayout = new ArrayList<SuitPiece>();

  
  
  /**
   * Add individual pieces to suit.
   */
  public void addSuitPiece(SuitPiece sp) {
    log.debug("Suit: Adding suit piece to ArrayList");
    suitLayout.add(sp);
  }
  
  

  /**
   * Displays each piece of a suit with name, color, and price.
   */
  public String showPieces() {
    List<String> printLayout = new ArrayList<String>();
    for (SuitPiece sp : suitLayout) {
      printLayout.add("Piece: " + sp.name());
      printLayout.add("Color: " + sp.color());
      printLayout.add("Price: " + sp.price() + "\n");
    }
    return printLayout.toString();

  }
  
  

  /**
   * Determines total cost of suit via calculation of each piece's price.
   * @return the total cost of the suit
   */
  public float getSuitCost() {
    float cost = 0.00f;

    for (SuitPiece sp : suitLayout) {
      cost += sp.price();
    }
    log.debug("Suit: Cost of suit generated");
    return cost;
  }
  
  

  /**
   * Factory Pattern to generate where order
   * will be fulfilled, based on total price of suit.
   * If suit price is greater than $200, order will be
   * fulfilled by warehouse
   * @return the order fulfillment type
   */
  public OrderFulfillment getOrderType() {
    if (this.getSuitCost() > 200.00f) {
      log.debug("Suit: Order fulfilled by the warehouse");
      return new WarehouseOrder();
    } else {
      log.debug("Suit: Order fulfilled by the store");
      return new StoreOrder();
    }
  }

}
