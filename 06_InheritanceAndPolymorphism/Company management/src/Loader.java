import Company.Company;
import Company.TypeStaff;
public class Loader
{
    public static void main (String[] args)
    {
        Company intel = new Company("Intel");
        intel.hire(TypeStaff.OPERATOR);
        intel.hire(TypeStaff.MANAGER);
        intel.hire(TypeStaff.TOPMANAGER);
        intel.hireAll(56, TypeStaff.TOPMANAGER);
        System.out.println("\n" + intel.getTopManagerFixedSalary() + "\n"+ intel.getOperatorFixedSalary() + "\n"+intel.getManagerFixedSalary());
        System.out.println("\n" + intel + "\n");
        System.out.println(intel.getEmployees().get(22).monthSalary);
            System.out.println();
    }

}
