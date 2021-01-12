import Company.Company;
import Company.staff.*;

import java.util.ArrayList;

public class Loader
{
    public static void main (String[] args)
    {
        Manager Peter = new Manager("Peter");
        //Manager Max = new Manager();
        ArrayList<Staff> manager = new ArrayList<>();
       // manager.add(Peter);
       // manager.add(Max);
       // System.out.println(Peter.getMonthSalary());
       // System.out.println(Max.getMonthSalary());
        TopManager AF = new TopManager("AF");
        TopManager AA = new TopManager("AA");
        System.out.println(AA.getMonthSalary());
        System.out.println(AF.getMonthSalary());
        Operator one = new Operator("one");
        Operator two = new Operator("one");
        System.out.println(one.getMonthSalary());
        System.out.println(two.getMonthSalary());
        Company Intel = new Company();
     //   Intel.hire(TopManager,"Sandy");
     //   Intel.hireAll(manager);
        Staff Sofia = new Manager("Sofia");
        System.out.println(Intel.getIncome());
        //Intel.;
        System.out.println(Intel.getManagerFixedSalary());


    }

}
