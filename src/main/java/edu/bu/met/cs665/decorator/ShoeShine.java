package edu.bu.met.cs665.decorator;

import edu.bu.met.cs665.builder.SuitBuilder;
import edu.bu.met.cs665.builder.SuitPiece;
import org.apache.log4j.Logger;

public class ShoeShine extends SuitDecorator {

  // create Logger object for method calls below
  private static Logger log = Logger.getLogger(SuitBuilder.class);
  
  // constructor
  public ShoeShine(SuitPiece suPiece) {
    super(suPiece);
  }

  //decorator methods
  public String shoeShine() {
    return " (Shined) ";
  }

  // implement decorator methods into name() method below
  @Override
  public String name() {
    log.debug("ShoeShine: Shoe shine option added");
    return suPiece.name() + shoeShine();
  }

  // shined shoes are 5 dollars extra
  @Override
  public float price() {
    return suPiece.price() + 5.00f;
  }

}
