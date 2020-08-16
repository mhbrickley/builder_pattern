package edu.bu.met.cs665.decorator;

import edu.bu.met.cs665.builder.SuitBuilder;
import edu.bu.met.cs665.builder.SuitPiece;
import org.apache.log4j.Logger;

public class Tie extends SuitDecorator {

  // create Logger object for method calls below
  private static Logger log = Logger.getLogger(SuitBuilder.class);
  
  // constructor
  public Tie(SuitPiece suPiece) {
    super(suPiece);
  }

  // decorator methods
  public String tie() {
    return " (w/ Tie) ";
  }

  // implement decorator methods into name() method below
  @Override
  public String name() {
    log.debug("Tie: Tie option added");
    return suPiece.name() + tie();
  }

  // tie is 10 dollars extra
  @Override
  public float price() {
    return suPiece.price() + 10.00f;
  }
}
