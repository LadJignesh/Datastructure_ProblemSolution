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
public class BnbTruck extends BnbVehicle {

    private int cargoWeight;

    public BnbTruck(String Owner, int totalRentalDays, int rentalCostPerDay, int cargoWeight) {
        this.cargoWeight = cargoWeight;
        super.setOwner(Owner);
        super.setRentalCostPerDay(rentalCostPerDay);
        super.setTotalRentalDays(totalRentalDays);
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }
}
