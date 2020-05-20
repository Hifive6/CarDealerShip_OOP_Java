public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombineWeight, truckWeight;
    private boolean is4wd;

    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, long towingCapacity, long truckWieght, boolean is4wd, VehicleClassification vehicleClass){
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color, vehicleClass);
        this.towingCapacity = towingCapacity;
        this.truckWeight = truckWieght;
        this.is4wd = is4wd;
        this.grossCombineWeight = this.towingCapacity + this.truckWeight;
    }

    //getters
    public long getTowingCapacity(){
        return this.towingCapacity;
    }
    public long getTruckWeight(){
        return this.truckWeight;
    }
    public long getGrossCombineWeight(){
        return this.grossCombineWeight;
    } 
    public boolean getIs4wd(){
        return this.is4wd;
    }

    //setters
    public void setTowingCapacity(long towingCapacity){
        this.towingCapacity = towingCapacity;
    }
    public void setTruckWeight(long weight){
        this.truckWeight = weight;
    }
    public void setGrossWieght(long weight){
        this.grossCombineWeight = weight;
    }

    //Method to automatically calculate GCW if no params give
    public void setGrossWieght(){
        this.grossCombineWeight = this.truckWeight + this.towingCapacity;
    }

    //Method Overloading to manually set GCW if params is provided
    public void setIs4wd(boolean is4wd){
        this.is4wd = is4wd;
    }

    @Override
    public String toString(){
        // Get the string output from our 'default'    superclass method
        // Example: 2018 Kia Sorrento
        // and store that in a variable for us to use 
        String str = super.toString();
        // If 4WD signify that in return string
        if(is4wd){
            str += ", (4 WD)"; // appends string ot end of our str variable
        }
        return str;
        
    }

}