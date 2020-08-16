package edu.bu.met.cs665.suit;

import edu.bu.met.cs665.builder.SuitPiece;

public abstract class Shoe implements SuitPiece {

  @Override
  public abstract String name();

  @Override
  public abstract String color();

  @Override
  public abstract int size();

  @Override
  public abstract float price();

}
