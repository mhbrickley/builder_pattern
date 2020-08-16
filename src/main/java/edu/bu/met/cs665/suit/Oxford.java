package edu.bu.met.cs665.suit;

public class Oxford extends Shoe {
  // instance variables
  private String name = "Oxfords";
  private String shoeColor;
  private int shoeSize;
  
  // constructor
  public Oxford(String shoeColor, int shoeSize) {
    super();
    this.shoeColor = shoeColor;
    this.shoeSize = shoeSize;
  }

  // override interface methods
  @Override
  public String name() {
    return this.name;
  }


  @Override
  public String color() {
    return this.shoeColor;
  }


  @Override
  public int size() {
    return this.shoeSize;
  }

  @Override
  // shoe size greater than 10 is more expensive 
  public float price() {
    if (this.shoeSize > 10) {
      return this.shoeSize * 2.00f;
    } else {
      return this.shoeSize * 1.50f;
    }

  }
  
  
  // getters and setters 
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getShoeColor() {
    return shoeColor;
  }

  public void setShoeColor(String shoeColor) {
    this.shoeColor = shoeColor;
  }

  public int getShoeSize() {
    return shoeSize;
  }

  public void setShoeSize(int shoeSize) {
    this.shoeSize = shoeSize;
  }
  
  
  
}
