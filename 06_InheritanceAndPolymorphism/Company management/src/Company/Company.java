package Company;

import Company.staff.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

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


    private final int minWage = 20000;  //минимальная ставка
    private int managerFixedSalary;
    private int topManagerFixedSalary;
    private int operatorFixedSalary;

    private static List<Staff> employees;
    private final String name;

    public Company(String name)
    {
        this.name = name;
        managerFixedSalary = (int) (minWage + (minWage*Math.random()));
        topManagerFixedSalary = (int)(minWage*4+minWage*Math.random());
        operatorFixedSalary = (int) (minWage+minWage*Math.random());

        employees = new ArrayList<>();

    }

    public int getManagerFixedSalary()
    {
        return managerFixedSalary;
    }
    public int getTopManagerFixedSalary()
    {
        return topManagerFixedSalary;
    }
    public int getOperatorFixedSalary()
    {
        return operatorFixedSalary;
    }

    public void hire(TypeStaff type)
    {
        Staff staff = null;
        switch (type)
        {
            case MANAGER:
                employees.add(new Manager(this));
            case OPERATOR:
                employees.add(new Operator(this));
            case TOPMANAGER:
                employees.add(new TopManager(this));

        }
    }
    public void hireAll(int count, TypeStaff type)
    {
        for (int i = 0; i < count; i++)
        {
            hire(type);
        }
    }
    public int getIncome()
    {
        int income = employees.size();
        return income;
    }
    public List<Staff> getEmployees()
    {
        return employees;
    }

}
