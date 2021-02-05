package Company;

public class TopManager implements Emploees
{
    private  int incomeForBonus;
    private double bonusCoefficient;
    private int bonus;
    private Company myCompany;


    public TopManager(Company company)
    {
        incomeForBonus = 1000000;
        bonusCoefficient = 1.5;
        bonus = (int)(company.getTopManagerFixedSalary()*bonusCoefficient);
        myCompany = company;

    }
    public int getMyCompanyIncome()
    {
       return this.myCompany.getCompanyIncome;
    }

    @Override
    public int getMonthSalary()
    {
        if (!(this.getMyCompanyIncome() <= incomeForBonus))
        {
            return (int) (this.myCompany.getTopManagerFixedSalary() + bonus);
        }
        else
        {
            return myCompany.getTopManagerFixedSalary();
        }
    }
    @Override
    public int getSalesAmount()
    {
        return 0;
    }
}
