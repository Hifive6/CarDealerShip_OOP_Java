//Limit our generic class to only be used by Vehicle or those derived from it
//This kind of restriction is called "bounded type"
public class PendingSale<E extends Vehicle> {
    private E someVehicle;

    public PendingSale(E someVehicle){
        this.someVehicle = someVehicle;
    }

    public E getSomeVehicle(){
        return this.someVehicle;
    }

    public void doSomePaperWork(){
        //get some paper work
    }
}