package com.xworkz.flipkartapp.orderitem;

import com.xworkz.flipkartapp.product.Product;

public class OrderItem {
   public String productId;
   Product product;
   public OrderItem(Product product){
     this.product=product;
   }

  public void getOrderItemDetails(){
      System.out.println("productId :"+productId);
      product.getProductDetails();
   }

}
