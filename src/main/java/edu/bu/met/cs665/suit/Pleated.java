package edu.bu.met.cs665.suit;

public class Pleated extends Pant {
  // instance variables
  private String name = "Pleated Pants";
  private String pantColor;
  private int pantSize;

  // constructor
  public Pleated(String pantColor, int pantSize) {
    super();
    this.pantColor = pantColor;
    this.pantSize = pantSize;
  }

  // override interface methods
  @Override
  public String name() {
    return this.name;
  }

  @Override
  public String color() {
    return this.pantColor;
  }

  @Override
  public int size() {
    return this.pantSize;
  }

  @Override
  //pant size greater than 30 is more expensive
  public float price() {
    if (this.pantSize > 30) {
      return this.pantSize * 2.00f;
    } else {
      return this.pantSize * 1.50f;
    }

  }
  

  // getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPantColor() {
    return pantColor;
  }

  public void setPantColor(String pantColor) {
    this.pantColor = pantColor;
  }

  public int getPantSize() {
    return pantSize;
  }

  public void setPantSize(int pantSize) {
    this.pantSize = pantSize;
  }

}
