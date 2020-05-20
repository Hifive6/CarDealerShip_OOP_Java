import java.time.LocalDateTime;
import java.util.List;

public abstract class Department {
    private String deptName;
    private int numEmployees;

    public Department(){
        this.deptName = "Generic";
        this.numEmployees = 0;
    }

    public Department(String name, int numEmployees){
        this.deptName = name;
        this.numEmployees = numEmployees;
    }


    public void printIsOpen(List<Department> depts, LocalDateTime today){
        //Cycle throught each department in provided list
        for(Department d : depts){
            // Print out name of Dept and return if that Dept is open today
            System.out.println(d.toString() + " is open today?" + d.isOpenToday(today));
        }
    }
    public abstract boolean isOpenToday(LocalDateTime day);

    @Override
    public String toString(){
        return this.deptName + "Department";
    }
}