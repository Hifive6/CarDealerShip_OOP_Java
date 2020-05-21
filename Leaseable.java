interface Leaseable {
    //Interfaces normally follow a naming converiont similar to classes but hey end in "-ible or -able"
    //Usually adjective because we usually interfaced to provide additional capabilities
    boolean isLeaseable();
    
    int getLeaseTerm();
    
    int getMaxMilesPerYear();

    default float getMileablePenality(){
        return 500.0f;
    }
}