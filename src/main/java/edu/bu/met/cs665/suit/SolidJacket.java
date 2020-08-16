package edu.bu.met.cs665.suit;

public class SolidJacket extends Jacket {
  // instance variables
  private String name = "Solid Jacket";
  private String jacketColor;
  private int jacketSize;
  
  // constructor
  public SolidJacket(String jacketColor, int jacketSize) {
    super();
    this.jacketColor = jacketColor;
    this.jacketSize = jacketSize;
  }

  @Override
  public String name() {
    return this.name;
  }

  @Override
  public String color() {
    return this.jacketColor;
  }

  @Override
  public int size() {
    return this.jacketSize;
  }

  @Override
  // jacket size greater than 50 is more expensive
  public float price() {
    if (this.jacketSize > 50) {
      return this.jacketSize * 2.00f;
    } else {
      return this.jacketSize * 1.50f;
    }
  }

  
  // getters and setters
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getJacketColor() {
    return jacketColor;
  }

  public void setJacketColor(String jacketColor) {
    this.jacketColor = jacketColor;
  }

  public int getJacketSize() {
    return jacketSize;
  }

  public void setJacketSize(int jacketSize) {
    this.jacketSize = jacketSize;
  }
  
  
  
}
