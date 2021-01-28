package Company.staff;
import Company.TypeStaff;
import Company.Company;

public class Operator extends Staff implements Employee
{
    // Operator — зарплата складывается только из фиксированной части.
  //  protected final double OPERATOR_MONTH_SALARY = 80000.00;

    public Operator(Company company)
    {
        super(company, TypeStaff.OPERATOR);
     }
    @Override
    public int getMonthSalary()
    {
        return company.getOperatorFixedSalary();
    }


}
