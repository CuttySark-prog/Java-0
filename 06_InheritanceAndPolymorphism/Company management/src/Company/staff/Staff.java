package Company.staff;

import Company.Company;

public abstract class Staff extends Company
{
    public int fixedSalary;
    public int salesAmount;
    public int monthSalary;

    public final int minSalesAmount = 115_000;
    public final int maxSalesAmount = 140_000;

    private String name;

    public Staff(String name)
    {
        this.name = name;
    }
}
