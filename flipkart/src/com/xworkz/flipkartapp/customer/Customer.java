package com.xworkz.flipkartapp.customer;

import com.xworkz.flipkartapp.order.Order;

public class Customer {

    public String customerName;
    public String eMail;
    public String phone;

    Order order;

    public Customer(Order order){
        this.order=order;
    }
    public void getShoppingDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Email: " + eMail);
        System.out.println("Phone Number: " + phone);
        order.getOrderDetails();
    }

}
