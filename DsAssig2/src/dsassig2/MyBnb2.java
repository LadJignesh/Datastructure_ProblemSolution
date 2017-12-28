/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassig2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Jignesh Lad
 */
public class MyBnb2 {
    
    /**
     * Initializations
     */
    public static ArrayList<BnbApartments> apartment = new ArrayList<BnbApartments>();
    public static ArrayList<BnbHouses> house = new ArrayList<BnbHouses>();
    public static ArrayList<BnbLuxuryVillas> lVillas = new ArrayList<BnbLuxuryVillas>();
    public static ArrayList<BnbCar> car = new ArrayList<BnbCar>();
    public static ArrayList<BnbTruck> truck = new ArrayList<BnbTruck>();
    public static int tRD_apartments = 0;
    public static int tRD_house = 0;
    public static int tRD_villas = 0;
    public static int count = 0;
    public static int tRD_car;
    public static int tRD_Truck;
    public static int totalIncome_property;
    public static int totalIncome_V = 0;
    
    public static void main(String[] args) throws IOException {
        System.out.println("READING INPUT FROM PROPERTY FILE STARTED");
        readInputPropertyFile("./src/dsassig2/inputProperty.txt");
        System.out.println("READING COMPLETED");
        System.out.println("READING INPUT FROM VEHICLE FILE STARTED");
        readInputVehicleFile("./src/dsassig2/inputVehicle.txt");
        System.out.println("READING COMPLETED");
        System.out.println("CALLING RENTAL PROPERTY METHOD");
        giveRentalProperty();
        System.out.println("CALLING totalIncome methods of property and vehicle");
        totalIncome_Property();
        totalIncome_Vehicle();
        
        for (BnbCar c : car) {
        int a=c.RentalItem(c.getTotalRentalDays());
        c.setTotalRentalDays(a);
        }
        
        for(BnbTruck t:truck){
        int a=t.RentalItem(t.getTotalRentalDays());
        t.setTotalRentalDays(a);    
        }
        System.out.println("PRINTING ALL PROPERTIES AND VEHICLES TO OUTPUT_PROPERTY.txt and OUTPUT_VEHICLE.txt");
        printAllProperties();
        printAllVehicles();
        
        System.out.println("TOTAL INCOME OF BNB PROPERTIES IS "+ totalIncome_property );
        System.out.println("TOTAL INCOME OF BNB VEHICLES IS "+totalIncome_V );
        
    }
    
    /**
     *readInputPropertyFile() is the method to read values from inputProperty file  
     */
    public static void readInputPropertyFile(String filePath) {
        try {
            File file = new File(filePath);

            try (Scanner input = new Scanner(file)) {
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    System.out.println(line);
                    String[] arr = line.split(",");
                    int propertytype = Integer.parseInt(arr[7]);
                    if (propertytype == 1) {
                        apartment.add(new BnbApartments(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])));
                        for (int i = 0; i < 3; i++) {
                        RentProperty(Integer.parseInt(arr[4]), Integer.parseInt(arr[7]));
            }
                    }
                    if (propertytype == 2) {
                        house.add(new BnbHouses(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])));
                    for (int i = 0; i < 3; i++) {
                     RentProperty(Integer.parseInt(arr[4]), Integer.parseInt(arr[7]));
            }
                    }
                    if (propertytype == 3) {
                        lVillas.add(new BnbLuxuryVillas(Integer.parseInt(arr[0]), arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]), Integer.parseInt(arr[5]), Integer.parseInt(arr[6])));
                    for (int i = 0; i < 3; i++) {
                    RentProperty(Integer.parseInt(arr[4]), Integer.parseInt(arr[7]));
            }
                    }
                    
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    /**
     *readInputVehicleFile() is the method to read values from inputVehicle file  
     */
    
    public static void readInputVehicleFile(String filePath) {
        try {
            File file = new File(filePath);

            try (Scanner input = new Scanner(file)) {
                while (input.hasNextLine()) {
                    String line = input.nextLine();
                    System.out.println(line);
                    String[] arr = line.split(",");
                    int vehicleType = Integer.parseInt(arr[4]);
                    if (vehicleType == 1) {
                        car.add(new BnbCar(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
                        RentVehicles(Integer.parseInt(arr[1]), Integer.parseInt(arr[3]));
                    }
                    if (vehicleType == 2) {
                        truck.add(new BnbTruck(arr[0], Integer.parseInt(arr[1]), Integer.parseInt(arr[2]), Integer.parseInt(arr[3])));
                        RentVehicles(Integer.parseInt(arr[1]), Integer.parseInt(arr[3]));
                    }
                    
                }
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
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

    private static void giveRentalProperty() {
        JTextField xField = new JTextField(5);
        JTextField yField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Property Id:"));
        myPanel.add(xField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Rental Days:"));
        myPanel.add(yField);
        try{
        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Rent Property", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION && xField.getText()!= null && yField.getText()!=null) {
            System.out.println("Property_Id value: " + xField.getText());
            System.out.println("Rental Days value: " + yField.getText());

        }else{
            System.out.println("Values not given Properly ");
            return;
        }
        boolean flag=false;
        if (result == JOptionPane.OK_OPTION) {
            for (BnbApartments a : apartment) {
                if (a.getUniRegNo() == Integer.parseInt(xField.getText())) {
                    a.setTotalNoOfSeasonRentalDays(Integer.parseInt(yField.getText()));
                    flag=true;
                    System.out.println("Property found for renting");
                    return;
                }
            }
            for (BnbHouses h : house) {
                if (h.getUniRegNo() == Integer.parseInt(xField.getText())) {
                    h.setTotalNoOfSeasonRentalDays(Integer.parseInt(yField.getText()));
                    flag=true;
                    System.out.println("Property found for renting");
                    return;
                }
            }
            for (BnbLuxuryVillas v : lVillas) {
                if (v.getUniRegNo() == Integer.parseInt(xField.getText())) {
                    v.setTotalNoOfSeasonRentalDays(Integer.parseInt(yField.getText()));
                    flag=true;
                    System.out.println("Property found for renting");
                    return;
                }
            }
            if(flag == false){
                System.out.println("No PropertyID match found for entered values");
            }
        }}
        catch(NumberFormatException e){
            System.out.println("Please Enter values Properly");
        }
    }

    private static void RentProperty(int rentalDays, int property) {
      
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
    
    private static void RentVehicles(int rentalDays, int property) {
        count = count + 1;
        if (property == 1) {
            tRD_car = tRD_car + rentalDays;
        }
        if (property == 2) {
            tRD_Truck = tRD_Truck + rentalDays;
        }
       
    }

    public static void printAllProperties() throws IOException {
        try (PrintWriter outl = new PrintWriter(new BufferedWriter(new FileWriter("./src/dsassig2/outputProperty.txt", true)))) {

            outl.println("====================================================");
            outl.println("--Apartment--");

            outl.println("Total Number of Rental Days for Apartment Property:- " + tRD_apartments);

            for (BnbApartments a : apartment) {
                outl.println("====================================================");
                outl.println("Unique Registration No:- " + a.getUniRegNo());
                outl.println("Owner's Name:- " + a.getOwnerName());
                outl.println("PostalAddress:- " + a.getPostalAddress());
                outl.println("Rental Cost Per Day:- " + a.getRentalCostPerDay());
                outl.println("Total Number of Season Rental Days:- " + a.getTotalNoOfSeasonRentalDays());
                outl.println("Storey No:-  " + a.getStoreyNo());
                outl.println("Number Of Beds:- " + a.getNoOfBeds());
                outl.println("====================================================");
            }

            outl.println("--House--");

            outl.println("Total Number of Rental Days for House Property:- " + tRD_house);

            for (BnbHouses h : house) {
                outl.println("====================================================");
                outl.println("Unique Registration No:- " + h.getUniRegNo());
                outl.println("Owner's Name:- " + h.getOwnerName());
                outl.println("PostalAddress:- " + h.getPostalAddress());
                outl.println("Rental Cost Per Day:- " + h.getRentalCostPerDay());
                outl.println("Total Number of Season Rental Days:- " + h.getTotalNoOfSeasonRentalDays());
                outl.println("Total Number of Storey:- " + h.getTotalNoOfStorey());
                outl.println("Clearing Fees:- " + h.getClearingFees());
                outl.println("====================================================");
            }

            outl.println("--Luxury Villas--");

            outl.println("Total Number of Rental Days for Luxury Villa Property:- " + tRD_villas);

            for (BnbLuxuryVillas v : lVillas) {
                outl.println("====================================================");
                outl.println("Unique Registration No:- " + v.getUniRegNo());
                outl.println("Owner's Name:- " + v.getOwnerName());
                outl.println("PostalAddress:- " + v.getPostalAddress());
                outl.println("Rental Cost Per Day:- " + v.getRentalCostPerDay());
                outl.println("Total Number of Season Rental Days:- " + v.getTotalNoOfSeasonRentalDays());
                outl.println("Room Service Cost Per Day:- " + v.getRoomServiceCostPerDay());
                outl.println("Luxury Tax Per Day" + v.getLuxuryTaxPerDay());
                outl.println("====================================================");
            }
        } catch (IOException e) {
            System.err.println(e);
        }
    }
    
    public static void printAllVehicles() throws IOException {
        try (PrintWriter outl = new PrintWriter(new BufferedWriter(new FileWriter("./src/dsassig2/outputVehicle.txt", true)))) {

            outl.println("====================================================");
            outl.println("--Car--");

            outl.println("Total Number of Rental Days for Car:- " + tRD_car);

            for (BnbCar c : car) {
                outl.println("====================================================");
                outl.println("Owner's Name:- " + c.getOwner());
                outl.println("Total Number Of Rental Days:- " + c.getTotalRentalDays());
                outl.println("Rental Cost Per Day:- " + c.getRentalCostPerDay());
                outl.println("Number of Passenger:- " + c.getPassengerNumber());
                outl.println("====================================================");
            }

            outl.println("--Truck--");

            outl.println("Total Number of Rental Days for Truck:- " + tRD_Truck);

            for (BnbTruck t : truck) {
                outl.println("====================================================");
                outl.println("Owner's Name:- " + t.getOwner());
                outl.println("Total Number Of Rental Days:- " + t.getTotalRentalDays());
                outl.println("Rental Cost Per Day:- " + t.getRentalCostPerDay());
                outl.println("Cargo Weight:- " + t.getCargoWeight());
                outl.println("====================================================");
            }

        } catch (IOException e) {
            System.err.println(e);
        }
    }

    public static void totalIncome_Property() {
        for (BnbApartments a : apartment) {
            totalIncome_property = totalIncome_property + (a.getRentalCostPerDay() * a.getTotalNoOfSeasonRentalDays());
           
        }
        for (BnbHouses h : house) {
            totalIncome_property = totalIncome_property + (h.getRentalCostPerDay() * h.getTotalNoOfSeasonRentalDays()) + h.getClearingFees();
            
        }
        for (BnbLuxuryVillas v : lVillas) {
            totalIncome_property = totalIncome_property + (v.getRentalCostPerDay() * v.getTotalNoOfSeasonRentalDays()) + v.getLuxuryTaxPerDay();
            
        }
        

        
    }
    
    public static void totalIncome_Vehicle() {
        for (BnbCar c : car) {
            totalIncome_V = totalIncome_V + (c.getRentalCostPerDay() * c.getTotalRentalDays());
            }
        for (BnbTruck t : truck) {
            totalIncome_V = totalIncome_V + (t.getRentalCostPerDay() * t.getTotalRentalDays());
           }
        System.out.println("TOTAL INCOME OF BNB VEHICLES IS " + getTotalIncome_V());
    }

    public static int getTotalIncome_V() {
        return totalIncome_V;
    }

    public static void setTotalIncome_V(int totalIncome_V) {
        MyBnb2.totalIncome_V = totalIncome_V;
    }

}
