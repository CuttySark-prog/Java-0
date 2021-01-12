package Company.staff;

public class TopManager extends Staff implements Employee
{
//    TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы,
//    если доход компании более 10 млн рублей.

    private int income = 11000000;
//    private final double bonusCoefficient = 1.5;
//    private double bonus = fixedSalary*bonusCoefficient;
    private final int incomeForBonus = 1000000;

    public TopManager(String name)
    {
//        fixedSalary = (int)(minWage*4+minWage*Math.random());
        super(name);
        System.out.println(fixedSalary);
    }
    @Override
    public int getMonthSalary()
    {
        if (income > incomeForBonus)
        {
            double bonusCoefficient = 1.5;
            int bonus =(int) (fixedSalary*bonusCoefficient);

//            System.out.println(bonus);
//            int data = (int)(fixedSalary+bonus);

            return (fixedSalary+bonus);
        }
        else
        {
          //  System.out.println("блин");
            return fixedSalary;
        }
    }

}
