package Company;

import Company.staff.*;

import java.util.ArrayList;
import java.util.Collection;

public class Company
{
    public static double getManagerFixedSalary;

    //  public static Object getMinWage;
//    1. Создайте класс компании Company, содержащей сотрудников и реализующей методы:
//
//    найм одного сотрудника — hire(),
//    найм списка сотрудников – hireAll(),
//    увольнение сотрудника – fire(),
//    получение значения дохода компании – getIncome().
//    Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.
//    2. Создайте два метода, возвращающие список указанной длины (count). Они должны содержать сотрудников,
//    отсортированных по убыванию и возрастанию заработной платы:
//
//    List<Employees> getTopSalaryStaff(int count),
//    List<Employees> getLowestSalaryStaff(int count).

    private int summOfmanagerMonthSalary = 0;
    private int summOftopManagerMonthSalary = 0;
    private int summOfoperatorMonthSalary = 0;

    private double minWage = 20000;  //минимальная ставка
    private int managerFixedSalary = 0;
    private int topManagerFixedSalary = 0;
    private int operatorFixedSalary = 0;

    private static ArrayList<Employee> staff = new ArrayList<>();
//

    public Company()
    {
      //  ArrayList<Employee>  Employees = new ArrayList<>();
        int managerFixedSalary = (int) (minWage + (minWage*Math.random()));
        int topManagerFixedSalary = (int)(minWage*4+minWage*Math.random());
        int operatorFixedSalary = (int) (minWage+minWage*Math.random());


        ArrayList<TopManager> topManagerStaff = new ArrayList<>();
        ArrayList<Operator> operatorStaff = new ArrayList<>();
        ArrayList<Manager> managersStaff = new ArrayList<>();

    }

    public int getManagerFixedSalary()
    {
        return managerFixedSalary;
    }


    public void hire(Staff employee, String name)
    {
        staff.add(employee,6);
    }
    public void hireAll(Collection employee)
    {
        staff.addAll(employee);
       //return employee;
    }
    public int getIncome()
    {
    //    System.out.println(staff.get(0));
        int income = staff.size();
        return income;
    }

}
