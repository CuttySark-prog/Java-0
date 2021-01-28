package Company.staff;
import Company.TypeStaff;
import Company.Company;

public class Manager extends Staff implements Employee
{
//        3. Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:
//
//    Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег.
//    Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
//    Каждый класс сотрудника должен имплементировать интерфейс Employees.

    private final double bonusCoefficient = 0.05;

    public Manager(Company company)
    {
        super(company, TypeStaff.MANAGER);
        salesAmount = (int) (minSalesAmount + (maxSalesAmount-minSalesAmount)*Math.random());
    }
    @Override
    public int getMonthSalary()
    {
        monthSalary = (int)(company.getManagerFixedSalary() + salesAmount*bonusCoefficient);
        return monthSalary;
    }
}
