package Company.staff;

public class Operator extends Staff implements Employee
{
    // Operator — зарплата складывается только из фиксированной части.
  //  protected final double OPERATOR_MONTH_SALARY = 80000.00;

    public Operator(String name)
    {
        super(name);
//        fixedSalary = (int) (minWage+minWage*Math.random());
    }
    @Override
    public int getMonthSalary()
    {
        return fixedSalary;
    }


}
