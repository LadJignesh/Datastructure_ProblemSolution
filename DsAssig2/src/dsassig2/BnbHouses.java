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

    /**
     * Setters and Getters
     */
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
