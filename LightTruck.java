public class LightTruck extends Vehicle {
    private long towingCapacity, grossCombineWeight, truckWeight;
    private boolean is4wd;

    public LightTruck(String VIN, double wholesaleCost, double retailPrice, int modelYear, String make, String model, String color, long towingCapacity, long truckWieght, boolean is4wd){
        super(VIN, wholesaleCost, retailPrice, modelYear, make, model, color);
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
    public void setIs4wd(boolean is4wd){
        this.is4wd = is4wd;
    }

    @Override
    public String toString(){
        String str = super.toString();
        // Get the string output from our 'default'    superclass method
        // Example: 2018 Kia Sorrento
        // and store that in a variable for us to use 
        if(is4wd){
            str += ", (4 WD)";
        }
        return str;
        
    }

}