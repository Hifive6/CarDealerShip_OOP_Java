//Convention dictates that  "implements" comes after "extends" if its present
public class Car extends Vehicle implements Leaseable, Discountable{
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
    //Inherit abstract method from ILeaseable
    @Override
    public boolean isLeaseable(){
        return true;
    }

    @Override
    public int getLeaseTerm(){
        return 24;
    }

    @Override
    public int getMaxMilesPerYear(){
        return 15_000;
    }

    //Inherit methods from IDiscountable
    @Override
    public float getMaxinumDiscountPct(){
        return 18.5f;
    }

    @Override
    public float getPersonDiscount(){
        return 12.5f;
    }

    @Override
    public float getCorporateDiscount(){
        return 20.0f;
    }

}