import Company.staff.Manager;

public class Loader
{
    public static void main (String[] args)
    {
        Manager tab1 = new Manager("Peter", 45000);
        Manager tab2 = new Manager("Sofi", 33000);
        tab1.getMonthSalary();
    }

}
