/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassig1;


/**
 *
 * @author Jignesh Lad
 */
/**
 * BnbApartments is the subclass of BnbProperty where:- storeyNo is the Number
 * of Storey noOfBeds is the Total Number of beds reserved for customers
 */
public class BnbApartments extends BnbProperty {

    private int storeyNo;

    private int noOfBeds;

    //private static ArrayList<Integer> apartments = new ArrayList<Integer>();
    public BnbApartments(int uniRegId, String ownerName, String postalAddress, int rentalCostPerDay, int totalNoOfSeasonRentalDays, int storeyNo, int noOfBeds) {
        super.setUniRegNo(uniRegId);
        super.setOwnerName(ownerName);
        super.setPostalAddress(postalAddress);
        super.setRentalCostPerDay(rentalCostPerDay);
        super.setTotalNoOfSeasonRentalDays(totalNoOfSeasonRentalDays);
        this.storeyNo = storeyNo;
        this.noOfBeds = noOfBeds;
    }

    public BnbApartments() {
        // Default Constructor
    }

    /**
     * Setters and Getters
     */
    //public static ArrayList<Integer> getApartments() {
    //    return apartments;
    //}
    //public static void setApartments(ArrayList<Integer> apartments) {
    //   BnbApartments.apartments = apartments;
    //}
    public int getStoreyNo() {
        return storeyNo;
    }

    public void setStoreyNo(int storeyNo) {
        this.storeyNo = storeyNo;
    }

    public int getNoOfBeds() {
        return noOfBeds;
    }

    public void setNoOfBeds(int noOfBeds) {
        this.noOfBeds = noOfBeds;
    }

}
