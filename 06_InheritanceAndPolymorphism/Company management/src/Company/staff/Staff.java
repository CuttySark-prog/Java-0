package Company.staff;
import Company.TypeStaff;
import Company.Company;

public abstract class Staff {
    protected Company company;
    public int fixedSalary;
    public int salesAmount;
    public int monthSalary;

    public final int minSalesAmount = 115_000;
    public final int maxSalesAmount = 140_000;

    public Staff(Company company, TypeStaff typeStaff)
    {
        this.company = company;
    }
}