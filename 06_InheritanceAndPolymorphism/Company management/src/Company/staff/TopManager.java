package Company.staff;
import Company.TypeStaff;
import Company.Company;

public class TopManager extends Staff implements Employee
{
//    TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
//    если доход компании более 10 млн рублей.

    private int income = 11000000;
    private final double bonusCoefficient = 1.5;
    private double bonus = fixedSalary*bonusCoefficient;
    private final int incomeForBonus = 1000000;

    public TopManager(Company company)
    {
        super(company, TypeStaff.TOPMANAGER);
    }
    @Override
    public int getMonthSalary()
    {
        if (income > incomeForBonus)
        {
            return (int) (company.getTopManagerFixedSalary() + bonus);
        }
        else
        {
            return fixedSalary;
        }
    }
}
