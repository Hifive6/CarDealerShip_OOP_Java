import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DealerShip {
    public static void main(String[] args){
        // Instanciate new object for eaach Department
        ServiceDepartment sd = new ServiceDepartment();
        FinanceDepartment fd = new FinanceDepartment();
        SalesDepartment sales = new SalesDepartment();

        //Add Department to a list
        List<Department> depts = new ArrayList<>();
        depts.add(sd);
        depts.add(fd);
        depts.add(sales);

        Department.printIsOpen(depts, LocalDateTime.now());
    }
}