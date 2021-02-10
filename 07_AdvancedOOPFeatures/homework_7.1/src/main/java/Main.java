import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static final String STAFF_TXT = "data/staff.txt";

    public static void main(String[] args) {
        List<Employee> staff = Employee.loadStaffFromFile(STAFF_TXT);
        System.out.println(staff);
        /*Не понимаю как работает - стащила со stackoverflow*/
//        Collections.sort(staff, (o1, o2) -> { int compareSalary = o1.getSalary().compareTo(o2.getSalary());
//                                              return compareSalary !=0
//                                                      ? compareSalary
//                                                      : o1.getName().compareTo(o2.getName());});
//        for(Employee employee : staff)
//        {
//            System.out.println(employee);
//        }
        Main.sortBySalaryAndAlphabet(staff);
    }
     /*Это понятнее, как работает(тоже оттуда), но непонятно относится это к лямбда-выражениям или нет*/
    public static void sortBySalaryAndAlphabet(List<Employee> staff)
    {
        //TODO Метод должен отсортировать сотрудников по заработной плате и алфавиту.
        List main = staff.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(Employee::getName)).collect(Collectors.toList());

        staff = main;
        for(Employee employee : staff)
        {
            System.out.println(employee);
        }
    }
}