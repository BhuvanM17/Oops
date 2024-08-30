package com.xworkz.insurenceapp.bikeinsurance;

import com.xworkz.insurenceapp.insurance.Insurance;

public class BikeInsurance extends Insurance {
    @Override
    public void claim(){
        System.out.println("Claim premium amount of 8000Rs");
    }

}
