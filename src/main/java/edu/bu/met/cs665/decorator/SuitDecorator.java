package edu.bu.met.cs665.decorator;

import edu.bu.met.cs665.builder.SuitPiece;

public abstract class SuitDecorator implements SuitPiece {
  // instance variable of interface for child decorators
  protected SuitPiece suPiece;
  
  // constructor
  public SuitDecorator(SuitPiece suPiece) {
    this.suPiece = suPiece;
  }

  // override methods from superclass
  @Override
  public String name() {
    return suPiece.name();
  }

  @Override
  public String color() {
    return suPiece.color();
  }

  @Override
  public int size() {
    return suPiece.size();
  }

  @Override
  public float price() {
    return suPiece.price();
  }
  
  
}
