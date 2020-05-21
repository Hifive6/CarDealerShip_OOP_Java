import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ServiceDepartment extends Department {
    //Constructor with deptName and numEmployees given
    public ServiceDepartment(){
        super("Service", 20);
    }

    //Create "association" btw Vehicle Class and ServiceDepartment
    //Very loose, lifetime of objects are independent of one another
    public boolean changeEngineOil(Vehicle v){
        // Because Service Department doesn't "own" the liftime of the object its good practice to ensure a valid object has been passed in
        if(v != null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean isOpenToday(LocalDateTime day){
        //SUNDAY is an example of an enumeration
        if(day.getDayOfWeek().equals(DayOfWeek.SUNDAY)){
            return false;
        } else {
            return true;
        }
    }
}