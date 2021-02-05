package Company;

public class Manager implements Emploees
{
    private int monthSalary;
    public final int minSalesAmount = 115_000;
    public final int maxSalesAmount = 140_000;
    private final double bonusCoefficient = 0.05;
    private int salesAmount = 0;

    public Manager(Company company)
    {
        salesAmount = (int) (minSalesAmount + (maxSalesAmount-minSalesAmount)*Math.random());
        monthSalary = (int) (bonusCoefficient*salesAmount + company.getManagerFixedSalary());
    }

    @Override
    public int getMonthSalary()
    {
        return monthSalary;
    }
    @Override
    public int getSalesAmount()
    {
        return salesAmount;
    }

}
