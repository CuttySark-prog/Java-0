package Company;

import Company.staff.Employees;
import Company.staff.Manager;
import Company.staff.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Company
{
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

    private double summOfmanagerMonthSalary = 0;
    private double summOftopManagerMonthSalary = 0;
    private double summOfoperatorMonthSalary = 0;

    private static ArrayList<String> staff = new ArrayList<>();

    public Staff hire(Staff employee, String name)
    {
        return employee;
    }
    public double getIncome()
    {
        double income = summOfmanagerMonthSalary + summOftopManagerMonthSalary + summOfoperatorMonthSalary;
        return income;
    }

}
