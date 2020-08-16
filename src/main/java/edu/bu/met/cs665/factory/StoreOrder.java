package edu.bu.met.cs665.factory;

public class StoreOrder implements OrderFulfillment {

  @Override
  public String orderChoice() {
    return "Order fulfilled in store";
  }
  
}
