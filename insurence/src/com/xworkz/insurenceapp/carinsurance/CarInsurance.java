package com.xworkz.insurenceapp.carinsurance;

import com.xworkz.insurenceapp.insurance.Insurance;

public class CarInsurance extends Insurance {
    @Override
    public void claim(){
        System.out.println("Claim premium amount of 16000Rs");
    }
}
