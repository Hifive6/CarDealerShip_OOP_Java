import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    public static void main(String[] args){
        // // Instanciate new object for eaach Department
        // ServiceDepartment sd = new ServiceDepartment();
        // FinanceDepartment fd = new FinanceDepartment();
        // SalesDepartment sales = new SalesDepartment();

        //Hava our Factory create new departments for us
        Department sd = DepartmentFactory.createDepartment(DepartmentNames.SERVICE);
        Department fd = DepartmentFactory.createDepartment(DepartmentNames.FINANCE);
        Department sales = DepartmentFactory.createDepartment(DepartmentNames.SALES);
        
        //Add Department to a list
        List<Department> depts = new ArrayList<>();
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Department.printIsOpen(depts, LocalDateTime.now());





        //Starting with light Truck and Car classes
        // Leaseable lease = new Car("232342234FDE", 330000.00, 420000.00, 2019, "Chevy", "Impala", "White", VehicleClassification.NEW);

        // System.out.println("Number of months to lease " + lease.getLeaseTerm());

        // LightTruck lt = new LightTruck("234Jfke123", 48000.00, 62000.00, 2019, "Chevy", "Silverardo", "Silver", 100000L, 900000L, true, VehicleClassification.OFF_LEASE);

        // if(lt.getIs4wd()){
        //     int gears = lt.xferCase.getNumGears();
        //     System.out.println("Number of Gears: " + gears);
        // }
        // lt.printVehicleType();
    }
}