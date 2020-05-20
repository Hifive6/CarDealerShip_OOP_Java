public class HybridCar extends Car{
    private int batteryLife, MPG;
    private String chargerType;

    public HybridCar(String VIN, double wholesaleCost, double retialPrice, int modelYear, String make, String model, String color, int batteryLife, int MPG, String chargerType){
        super(VIN, wholesaleCost, retialPrice, modelYear, make, model, color);
        this.batteryLife = batteryLife;
        this.MPG = MPG;
        this.chargerType = chargerType;
    }
    
//getters
        public int getBatteryLife(){
            return this.batteryLife;
        }
        public int getMPG(){
            return this.MPG;
        }
        public String getChargerType(){
            return this.chargerType;
        }

//Setters
        public void setBatteryLife(int batteryLife) {
            this.batteryLife = batteryLife;
        }

        public void setMPG(int mpg) {
            this.MPG = mpg;
        }

        public void setChargerType(String chargerType) {
            this.chargerType = chargerType;
        }
    
    
        
}