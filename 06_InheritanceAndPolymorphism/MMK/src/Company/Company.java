package Company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Company
{
    protected ArrayList<Emploees> staff;
    protected  int minWage = 25000;
    int managerFixedSalary ;
    int topManagerFixedSalary ;
    int operatorFixedSalary ;
    int companyIncome = 0;
    String name;

    public Company(String nameCompany)
    {
        this.managerFixedSalary = (int) (minWage + (minWage*Math.random()));
        this.topManagerFixedSalary = (int)(minWage*4+minWage*Math.random());
        this.operatorFixedSalary = (int) (minWage+minWage*Math.random());
        staff = new ArrayList<>();
        this.name = nameCompany;
    }
    public void hire (Staff position)
    {
        switch (position)
        {
            case MANAGER:
                staff.add(new Manager(this));
                break;
            case OPERATOR:
                staff.add(new Operator(this));
                break;
            case TOP_MANAGER:
                staff.add(new TopManager(this));
                break;
        }
    }
    public void hireAll(Staff position, int quantity)
    {
        for (int i = 0; i < quantity; i++)
        {
            hire(position);
        }
  //      System.out.println(this.staff.size());
    }
    public int getOperatorFixedSalary()
        {
            return operatorFixedSalary;
        }
    public int getManagerFixedSalary()
    {
        return operatorFixedSalary;
    }
    public int getTopManagerFixedSalary()
    {
        return operatorFixedSalary;
    }
    public ArrayList<Integer> salaryArray()
    {
        ArrayList <Integer> salary = this.staff.stream().map(emploees -> emploees.getMonthSalary()).sorted(Comparator.naturalOrder()).collect(Collectors.toCollection(ArrayList::new));
        return salary;
    }
    public void printTopMaxSalary(int top)
    {
       if(top<=salaryArray().size())
       {
           System.out.println("\n" + "Max" + top + "\n-------------------");
           for (int i = salaryArray().size()-1; i >= (salaryArray().size() - top); i--)
           {
               System.out.println(salaryArray().get(i));
           }
       }
           else System.out.println("Таково колличества сотрудников у нас нет");
    }
    public void printTopMinSalary(int top)
    {
        if(top<=salaryArray().size())
        {
            System.out.println("\n" + "Min" + top + "\n-------------------");
            for (int i = 0; i < top; i++)
            {
                System.out.println(salaryArray().get(i));
            }
        }

        else System.out.println("Таково колличества сотрудников у нас нет");
    }
    public void dismiss(double percent)
    {
        double quantityDismiss = (this.staff.size())*(percent/100);
        int qa = (int) (quantityDismiss);
        for(int i = 0; i < qa; i++)
        {
            int quantityStaff = (int)(this.staff.size()*Math.random());
            this.staff.remove(quantityStaff);
        }
    }
    public int getCompanyIncome()
    {
        for (int i=0; i< this.staff.size(); i++)
        {
           companyIncome = companyIncome + this.staff.get(i).getSalesAmount();
        }
        return companyIncome;
    }


}
