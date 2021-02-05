import Company.Company;
import Company.Staff;



public class Loader
{
    public static void main (String[] args)
    {
        Company yotta = new Company("Yotta");
        yotta.hireAll(Staff.OPERATOR ,180);
        yotta.hireAll(Staff.MANAGER,80);
        yotta.hireAll(Staff.TOP_MANAGER,10);
        yotta.printTopMaxSalary(10);
        yotta.printTopMinSalary(30);
        yotta.dismiss(50);
        yotta.printTopMaxSalary(10);
        yotta.printTopMinSalary(30);

  //      System.out.println(yotta.getCompanyIncome());
    }
}
