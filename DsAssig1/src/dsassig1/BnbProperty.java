package dsassig1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jignesh Lad
 */

/**
*BnbProperty is the super class where:- 
*uniRegNo is Unique Registration Number
*ownerName is the Owner's name
*postal Address is the Postal Address of the Owner
*rentalCostPerDay is the Rental Cost for each Day
*totalNoOfSeasonRentalDays is the Total Number of seasonal Rental Days
*/
public class BnbProperty {
    private int uniRegNo;
    
    private String ownerName;
    
    private String postalAddress;
    
    private int rentalCostPerDay;
    
    private int totalNoOfSeasonRentalDays;

    public int getUniRegNo() {
        return uniRegNo;
    }

    public void setUniRegNo(int uniRegNo) {
        this.uniRegNo = uniRegNo;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getPostalAddress() {
        return postalAddress;
    }

    public void setPostalAddress(String postalAddress) {
        this.postalAddress = postalAddress;
    }

    public int getRentalCostPerDay() {
        return rentalCostPerDay;
    }

    public void setRentalCostPerDay(int rentalCostPerDay) {
        this.rentalCostPerDay = rentalCostPerDay;
    }

    public int getTotalNoOfSeasonRentalDays() {
        return totalNoOfSeasonRentalDays;
    }

    public void setTotalNoOfSeasonRentalDays(int totalNoOfSeasonRentalDays) {
        this.totalNoOfSeasonRentalDays = totalNoOfSeasonRentalDays;
    }
    
    
}
