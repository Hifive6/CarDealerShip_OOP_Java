// Our first Factory! Depending on name of Department given, creates a new instacne of the Department

public class DepartmentFactory {
    public static Department createDepartment(DepartmentNames name){
        Department d = null;

        if(name == null){
            return null;
        }

        switch(name){
            case SERVICE:
                d = new ServiceDepartment();
                break;
            case SALES:
                d = new SalesDepartment();
                break;
            case FINANCE:
                d = new FinanceDepartment();
                break;
            default:
        }
        return d;
    }
}