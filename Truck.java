public class Truck extends Vehicle {
    //Simple Car Constructor inheriting all of the methds and properties of Vehicle
    public Truck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, VehicleClassification vehicleClass){
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
    }
}