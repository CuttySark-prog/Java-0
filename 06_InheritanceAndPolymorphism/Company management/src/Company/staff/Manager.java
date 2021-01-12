package Company.staff;

import Company.Company;

public class Manager extends Staff implements Employee
{
//        3. Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:
//
//    Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
//    Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
//    Каждый класс сотрудника должен имплементировать интерфейс Employees.
//    private int fixedSalary;
//    private int salesAmount;
//    private int monthSalary;
    private final double bonusCoefficient = 0.05;
 //   private final int minWage = 20_000;


    public Manager(String name)
    {
 //       fixedSalary = (int) (minWage + (minWage*Math.random()));
        super(name);
        salesAmount = (int) (minSalesAmount + (maxSalesAmount-minSalesAmount)*Math.random());
    }
    @Override
    public int getMonthSalary()
    {
        monthSalary = (int)(Company.getManagerFixedSalary + salesAmount*bonusCoefficient);
        return monthSalary;
    }
}
