/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassig1;

import java.util.ArrayList;

/**
 *
 * @author Jignesh Lad
 */
public class DsAssig1 {

    public static ArrayList<BnbApartments> apartment = new ArrayList<BnbApartments>();
    public static ArrayList<BnbHouses> house = new ArrayList<BnbHouses>();
    public static ArrayList<BnbLuxuryVillas> lVillas = new ArrayList<BnbLuxuryVillas>();
    private static int totalIncome = 0;
    private static int totalRentalDays = 0;
    public static int tRD_apartments = 0;
    public static int tRD_house = 0;
    public static int tRD_villas = 0;
    public static int count = 0;

    public static void main(String[] args) {
        System.out.println("Inserting Data To Array List");
        fillInProperty(1, "Jerry", "dublin_1", 100, 23, 2, 1, 1);
        fillInProperty(2, "Tanvi", "dublin_12", 110, 21, 2, 1, 1);
        fillInProperty(3, "Darshan", "dublin_13", 120, 2, 2, 1, 1);
        fillInProperty(11, "Raj", "dublin_14", 103, 21, 2, 1, 2);
        fillInProperty(12, "Max", "dublin_16", 106, 5, 2, 1, 2);
        fillInProperty(13, "John", "dublin_17", 106, 3, 2, 1, 2);
        fillInProperty(14, "Lara", "dublin_18", 106, 15, 2, 1, 3);
        fillInProperty(15, "William", "dublin_4", 107, 4, 2, 1, 3);
        fillInProperty(16, "Umang", "dublin_15", 108, 7, 2, 1, 3);
        System.out.println("Data Enetered");
        System.out.println("Printing ALL PROPERTIES");
        printAllProperties();
        System.out.println("====================================================");
        System.out.println("TOTAL RENTAL DAYS OF BNB APARTMENTS IS "+ tRD_apartments);
        System.out.println("TOTAL RENTAL DAYS OF BNB HOUSES IS "+tRD_house);
        System.out.println("TOTAL RENTAL DAYS OF BNB LUXURY VILLAS IS "+tRD_villas);
        System.out.println("====================================================\n");
        totalIncome();
        System.out.println("\n====================================================");

    }

    public static void fillInProperty(int uniqId, String ownerName, String postal_addr, int rentPerDay, int totalNoOfDays, int storeyNo, int no_Beds, int prop_type) {
        int propertytype = prop_type;
        if (propertytype == 1) {
            apartment.add(new BnbApartments(uniqId, ownerName, postal_addr, rentPerDay, totalNoOfDays, storeyNo, no_Beds));
            for (int i = 0; i < 3; i++) {
                RentProperty(totalNoOfDays, prop_type);
            }

        }
        if (propertytype == 2) {
            house.add(new BnbHouses(uniqId, ownerName, postal_addr, rentPerDay, totalNoOfDays, storeyNo, no_Beds));
            for (int i = 0; i < 3; i++) {
                RentProperty(totalNoOfDays, prop_type);
            }
        }
        if (propertytype == 3) {
            lVillas.add(new BnbLuxuryVillas(uniqId, ownerName, postal_addr, rentPerDay, totalNoOfDays, storeyNo, no_Beds));
            for (int i = 0; i < 3; i++) {
                RentProperty(totalNoOfDays, prop_type);
            }
        }

    }

    private static void RentProperty(int rentalDays, int property) {
        count = count + 1;
        if (property == 1) {
            tRD_apartments = tRD_apartments + rentalDays;
        }
        if (property == 2) {
            tRD_house = tRD_house + rentalDays;
        }
        if (property == 3) {
            tRD_villas = tRD_villas + rentalDays;
        }
    }

    public static void printAllProperties() {
        System.out.println("====================================================");
        System.out.println("--Apartment--");

        System.out.println("Total Number of Rental Days for Apartment Property:- " + tRD_apartments);

        for (BnbApartments a : apartment) {
            System.out.println("====================================================");
            System.out.println("Unique Registration No:- " + a.getUniRegNo());
            System.out.println("Owner's Name:- " + a.getOwnerName());
            System.out.println("PostalAddress:- " + a.getPostalAddress());
            System.out.println("Rental Cost Per Day:- " + a.getRentalCostPerDay());
            System.out.println("Total Number of Season Rental Days:- " + a.getTotalNoOfSeasonRentalDays());
            System.out.println("Storey No:-  " + a.getStoreyNo());
            System.out.println("Number Of Beds:- " + a.getNoOfBeds());
            System.out.println("====================================================");
        }

        System.out.println("--House--");

        System.out.println("Total Number of Rental Days for House Property:- " + tRD_house);

        for (BnbHouses h : house) {
            System.out.println("====================================================");
            System.out.println("Unique Registration No:- " + h.getUniRegNo());
            System.out.println("Owner's Name:- " + h.getOwnerName());
            System.out.println("PostalAddress:- " + h.getPostalAddress());
            System.out.println("Rental Cost Per Day:- " + h.getRentalCostPerDay());
            System.out.println("Total Number of Season Rental Days:- " + h.getTotalNoOfSeasonRentalDays());
            System.out.println("Total Number of Storey:- " + h.getTotalNoOfStorey());
            System.out.println("Clearing Fees:- " + h.getClearingFees());
            System.out.println("====================================================");
        }

        System.out.println("--Luxury Villas--");

        System.out.println("Total Number of Rental Days for Luxury Villa Property:- " + tRD_villas);

        for (BnbLuxuryVillas v : lVillas) {
            System.out.println("====================================================");
            System.out.println("Unique Registration No:- " + v.getUniRegNo());
            System.out.println("Owner's Name:- " + v.getOwnerName());
            System.out.println("PostalAddress:- " + v.getPostalAddress());
            System.out.println("Rental Cost Per Day:- " + v.getRentalCostPerDay());
            System.out.println("Total Number of Season Rental Days:- " + v.getTotalNoOfSeasonRentalDays());
            System.out.println("Room Service Cost Per Day:- " + v.getRoomServiceCostPerDay());
            System.out.println("Luxury Tax Per Day" + v.getLuxuryTaxPerDay());
            System.out.println("====================================================");
        }
    }

    public static void totalIncome() {
        for (BnbApartments a : apartment) {
            totalIncome = totalIncome + (a.getRentalCostPerDay() * a.getTotalNoOfSeasonRentalDays());
        }
        for (BnbHouses h : house) {
            totalIncome = totalIncome + ((h.getRentalCostPerDay() + h.getClearingFees()) * h.getTotalNoOfSeasonRentalDays());
        }
        for (BnbLuxuryVillas v : lVillas) {
            totalIncome = totalIncome + ((v.getRentalCostPerDay() + v.getLuxuryTaxPerDay()) * v.getTotalNoOfSeasonRentalDays());
        }
        totalRentalDays=tRD_apartments+tRD_house+tRD_villas;
        System.out.println("Total Rental Days are "+ totalRentalDays);
        System.out.println("TOTAL INCOME OF BNB PROPERTIES IS " + getTotalIncome() + " Rs.");
        
    }

    public static int getTotalIncome() {
        return totalIncome;
    }

    public static void setTotalIncome(int totalIncome) {
        DsAssig1.totalIncome = totalIncome;
    }

}
