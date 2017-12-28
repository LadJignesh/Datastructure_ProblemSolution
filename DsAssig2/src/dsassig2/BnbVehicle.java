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
public class BnbVehicle implements RentalItem {

    private String Owner;
    private int TotalRentalDays;
    private int RentalCostPerDay;
    private int rent_days;

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public int getTotalRentalDays() {
        return TotalRentalDays;
    }

    public void setTotalRentalDays(int TotalRentalDays) {
        this.TotalRentalDays = TotalRentalDays;
    }

    public int getRentalCostPerDay() {
        return RentalCostPerDay;
    }

    public void setRentalCostPerDay(int RentalCostPerDay) {
        this.RentalCostPerDay = RentalCostPerDay;
    }

    @Override
    public int RentalItem(int RentalDays) {
    return rent_days=RentalDays+1;    
    }

}
