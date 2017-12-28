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
public class BnbCar extends BnbVehicle {

    private int passengerNumber;

    public BnbCar(String Owner, int totalRentalDays, int rentalCostPerDays, int passengerNumber) {
        this.passengerNumber = passengerNumber;
        super.setOwner(Owner);
        super.setRentalCostPerDay(rentalCostPerDays);
        super.setTotalRentalDays(totalRentalDays);
    }

    public int getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

}
