/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dsassig2;


/**
 *
 * @author Jignesh Lad
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

    /**
     * Setters and Getters
     * @return 
     */
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
