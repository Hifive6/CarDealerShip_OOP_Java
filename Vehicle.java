//Construcor and class that is an example of abstraction
//Will give specific classes info to begin
public class Vehicle{
    private String VIN, make, model, color;
    private double wholesaleCost, retailPrice;
    private int modelYear;
    private VehicleClassification vehicleClass;

    public Vehicle(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, VehicleClassification vehicleClass){
        this.VIN = VIN;
        this.wholesaleCost = wholesaleCost;
        this.retailPrice = retailPrice;
        this.modelYear = modelYear;
        this.make = make;
        this.model = model;
        this.color = color;
        this.vehicleClass = vehicleClass;
    }

    //getters
    public String getVin(){
        return VIN;
    }
    public double getWholesaleCost(){
        return wholesaleCost;
    }
    public double getRetailPrice(){
        return retailPrice;
    }
    public int getModelYear(){
        return modelYear;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public VehicleClassification getVehicleClass(){
        return vehicleClass;
    }

    //setters
    public void setVin(String VIN){
        this.VIN = VIN;
    }
    public void setWholesaleCost(double wholesaleCost) {
        this.wholesaleCost = wholesaleCost;
    }
    public void setRetailPrice(double retailPrice){
        this.retailPrice = retailPrice;
    }
    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }
    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void getColor(String color){
        this.color = color;
    }

    public void setVehicleClass(VehicleClassification vehicleClass) {
        this.vehicleClass = vehicleClass;
    }
    @Override // Annotation telling us an dcomplier that we are overridding prviously defined behavior
    public String toString(){
        return this.getModelYear() + " " + this.getMake() + " " + this.getModel();
        //Expected return 2018 Kia Sorrento    
    }

    public double getTargetMargin(){
        return this.retailPrice - this.wholesaleCost;
    }


}

