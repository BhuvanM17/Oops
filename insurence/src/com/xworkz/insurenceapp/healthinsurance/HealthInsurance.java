package com.xworkz.insurenceapp.healthinsurance;

import com.xworkz.insurenceapp.insurance.Insurance;

public class HealthInsurance extends Insurance {
    @Override
    public void claim(){
        System.out.println("Claim premium amount of 35000Rs");
    }

}
