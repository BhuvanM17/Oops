package com.xworkz.flipkartapp;

import com.xworkz.flipkartapp.customer.Customer;
import com.xworkz.flipkartapp.order.Order;
import com.xworkz.flipkartapp.orderitem.OrderItem;
import com.xworkz.flipkartapp.product.Product;

public class FlipkartRunner {

    public static void main(String[] args) {


        Product product=new Product();
        product.productName="Iphone";
        product.price=69000.00;
        OrderItem orderItem = new OrderItem(product);
        orderItem.productId="V765";
        Order order = new Order(orderItem);
        order.orderId="A101";
        Customer agasthya = new Customer(order);
        agasthya.customerName="dev";
        agasthya.eMail="dev12@gmail.com";
        agasthya.phone="76487697656";
        agasthya.getShoppingDetails();

    }

}
