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

/**
 *BnbLuxuryVillas is a subclass of BnbProperty
 * roomServiceCostPerDay is the Service cost in villas per Day
 * luxuryTaxPerDay is the Luxury Tax charged per Day
 */
public class BnbLuxuryVillas extends BnbProperty {

    private int roomServiceCostPerDay;

    private int luxuryTaxPerDay;

    public BnbLuxuryVillas(int uniRegId, String ownerName, String postalAddress, int rentalCostPerDay, int totalNoOfSeasonRentalDays, int roomServiceCostPerDay, int luxuryTaxPerDay) {
        super.setUniRegNo(uniRegId);
        super.setOwnerName(ownerName);
        super.setPostalAddress(postalAddress);
        super.setRentalCostPerDay(rentalCostPerDay);
        super.setTotalNoOfSeasonRentalDays(totalNoOfSeasonRentalDays);
        this.roomServiceCostPerDay = roomServiceCostPerDay;
        this.luxuryTaxPerDay = luxuryTaxPerDay;
    }

    public BnbLuxuryVillas() {
        //Default Constructor
    }

    /**
     * Setters and Getters
     */
    // public static ArrayList<Integer> getApartments() {
    //     return apartments;
    // }
    // public static void setApartments(ArrayList<Integer> apartments) {
    //     BnbLuxuryVillas.apartments = apartments;
    //}
    public int getRoomServiceCostPerDay() {
        return roomServiceCostPerDay;
    }

    public void setRoomServiceCostPerDay(int roomServiceCostPerDay) {
        this.roomServiceCostPerDay = roomServiceCostPerDay;
    }

    public int getLuxuryTaxPerDay() {
        return luxuryTaxPerDay;
    }

    public void setLuxuryTaxPerDay(int luxuryTaxPerDay) {
        this.luxuryTaxPerDay = luxuryTaxPerDay;
    }

}
