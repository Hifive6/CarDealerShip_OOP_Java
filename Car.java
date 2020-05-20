public class Car extends Vehicle {
    //Simple Car Constructor inheriting all of the methds and properties of Vehicle
    public Car(String VIN, double wholesaleCost, double retialPrice, int modelYear, String make, String model, String color, VehicleClassification vehicleClass){
        super(VIN, wholesaleCost, retialPrice, modelYear, make, model, color, vehicleClass);
    }

    @Override
    public double getTargetMargin(){
        // return this.getRetailPrice() - this.getWholesaleCost() - 1000;
        // or a bette way to write it is 
        return super.getTargetMargin() - 1000;
        // Use the getTargetMargin method as its defined in our superclass (Vehicle)
    }
}