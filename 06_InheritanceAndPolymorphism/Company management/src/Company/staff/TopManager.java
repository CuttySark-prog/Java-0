package Company.staff;


public class TopManager extends Staff
{
//    TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
//    если доход компании более 10 млн рублей.
    private double topManagerMonthSalary = 120000.00;
    private double bonusСoefficient = 1.5;
    private double bonus = topManagerMonthSalary*bonusСoefficient;


    @Override
    public double getMonthSalary()
    {
        if (topManagerMonthSalary>10000000)
        {
           return (topManagerMonthSalary+bonus);
        }
        else
        {
            return topManagerMonthSalary;
        }
    }


}
