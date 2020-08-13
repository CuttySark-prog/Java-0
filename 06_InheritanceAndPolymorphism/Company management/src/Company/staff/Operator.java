package Company.staff;

public class Operator extends Staff
{
    // Operator — зарплата складывается только из фиксированной части.
    protected final double OPERATOR_MONTH_SALARY = 80000.00;
    @Override
    public double getMonthSalary()
    {
        return OPERATOR_MONTH_SALARY;
    }


}
