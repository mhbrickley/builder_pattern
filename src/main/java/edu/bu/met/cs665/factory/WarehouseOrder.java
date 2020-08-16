package edu.bu.met.cs665.factory;

public class WarehouseOrder implements OrderFulfillment {

  @Override
  public String orderChoice() {
    return "Order sent to warehouse";
  }
   
}
