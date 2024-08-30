package com.xworkz.flipkartapp.order;

import com.xworkz.flipkartapp.orderitem.OrderItem;

public class Order {
    public String orderId;
    OrderItem orderItem;

  public   Order(OrderItem orderItem){
        this.orderItem=orderItem;
    }

 public void   getOrderDetails(){
     System.out.println("Order Id:"+orderId);
      orderItem.getOrderItemDetails();
    }

}
