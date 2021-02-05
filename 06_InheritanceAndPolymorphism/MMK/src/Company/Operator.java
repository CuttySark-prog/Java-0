package Company;

public class Operator implements Emploees
{
    private int monthSalary;
    public Operator(Company company)
    {
        monthSalary = company.getOperatorFixedSalary();
    }

    @Override
    public int getMonthSalary()
    {
        return monthSalary;
    }
    @Override
    public int getSalesAmount()
    {
        return 0;
    }
}
