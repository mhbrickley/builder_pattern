package edu.bu.met.cs665.suit;

public class StripedShirt extends Shirt {
  // instance variables
  private String name = "Striped Shirt";
  private String shirtColor;
  private int shirtSize;

  // constructor
  public StripedShirt(String shirtColor, int shirtSize) {
    super();
    this.shirtColor = shirtColor;
    this.shirtSize = shirtSize;
  }

  // override interface methods
  @Override
  public String name() {
    return this.name;
  }

  @Override
  public String color() {
    return this.shirtColor;
  }

  @Override
  public int size() {
    return this.shirtSize;
  }

  @Override
  // shirt size greater than 15 is more expensive
  public float price() {
    if (this.shirtSize > 15) {
      return this.shirtSize * 2.00f;
    } else {
      return this.shirtSize * 1.50f;
    }

  }
  
  
  //getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShirtColor() {
    return shirtColor;
  }

  public void setShirtColor(String shirtColor) {
    this.shirtColor = shirtColor;
  }

  public int getShirtSize() {
    return shirtSize;
  }

  public void setShirtSize(int shirtSize) {
    this.shirtSize = shirtSize;
  }
  
}
