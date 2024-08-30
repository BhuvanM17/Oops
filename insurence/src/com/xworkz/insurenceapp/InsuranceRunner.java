package com.xworkz.insurenceapp;

import com.xworkz.insurenceapp.bikeinsurance.BikeInsurance;
import com.xworkz.insurenceapp.carinsurance.CarInsurance;
import com.xworkz.insurenceapp.insurance.Insurance;

public class InsuranceRunner {
    public static void main(String[] args) {
        Insurance insurance = new CarInsurance();
        insurance.claim();

        Insurance insuranceBike = new BikeInsurance();
        insuranceBike.claim();
    }
}
