package Exercise.speedRacing_03;

import org.w3c.dom.ls.LSOutput;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPerKilometer;
    private  int traveledDistance;

    public Car(String model, double fuelAmount, double fuelCostForAkm) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPerKilometer = fuelCostForAkm;
        this.traveledDistance=0;
    }
    //check whether the car can travel the distance
    public boolean hasSufficientFuel(int kilometers){
        return this.fuelAmount >= calculateNeededFuel(kilometers);

    }
    //decrease the fuel
    public void decreaseFuel(int kilometers){
        this.fuelAmount -= calculateNeededFuel(kilometers);
    }
    //increase the fuel
    public void increaseTravelDistance(int kilometers){
        this.traveledDistance += kilometers;
    }


    @Override
    public String toString() {
        return String.format("%s %.2f %d",this.model,this.fuelAmount,this.traveledDistance);
    }

    private double calculateNeededFuel(int kilometers){
        return this.fuelCostPerKilometer * kilometers;
    }




}
