import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    public static void main(String[] args){
        // // Instanciate new object for eaach Department
        // ServiceDepartment sd = new ServiceDepartment();
        // FinanceDepartment fd = new FinanceDepartment();
        // SalesDepartment sales = new SalesDepartment();

        // //Add Department to a list
        // List<Department> depts = new ArrayList<>();
        // depts.add(sd);
        // depts.add(fd);
        // depts.add(sales);

        // Department.printIsOpen(depts, LocalDateTime.now());

        Leaseable lease = new Car("232342234FDE", 330000.00, 420000.00, 2019, "Chevy", "Impala", "White", VehicleClassification.NEW);

        System.out.println("Number of months to lease " + lease.getLeaseTerm());
    }
}