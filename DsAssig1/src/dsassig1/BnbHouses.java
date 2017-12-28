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
 * BnbHouses is the subclass of BnbProperty where:- totalNoOfStorey is the
 * Number of Storeys clearingFees is the Clearing Fees for Houses
 *
 */
public class BnbHouses extends BnbProperty {

    private int totalNoOfStorey;

    private int clearingFees;

    public BnbHouses(int uniRegId, String ownerName, String postalAddress, int rentalCostPerDay, int totalNoOfSeasonRentalDays, int totalNoOfStorey, int clearingFees) {
        super.setUniRegNo(uniRegId);
        super.setOwnerName(ownerName);
        super.setPostalAddress(postalAddress);
        super.setRentalCostPerDay(rentalCostPerDay);
        super.setTotalNoOfSeasonRentalDays(totalNoOfSeasonRentalDays);
        this.totalNoOfStorey = totalNoOfStorey;
        this.clearingFees = clearingFees;
    }

    public BnbHouses() {
        //Default Constructor
    }

    /**
     * Setters and Getters
     * @return 
     */
    //public static ArrayList<Integer> getApartments() {
    //    return apartments;
    //}
    //public static void setApartments(ArrayList<Integer> apartments) {
    //    BnbHouses.apartments = apartments;
    //}
    public int getTotalNoOfStorey() {
        return totalNoOfStorey;
    }

    public void setTotalNoOfStorey(int totalNoOfStorey) {
        this.totalNoOfStorey = totalNoOfStorey;
    }

    public int getClearingFees() {
        return clearingFees;
    }

    public void setClearingFees(int clearingFees) {
        this.clearingFees = clearingFees;
    }
}
