import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main (String args[])
    {
        System.out.println("Введите номер телефона: ");
        Scanner enterNumber = new Scanner(System.in);
        String number = enterNumber.nextLine();
        //Версия 2

        var pattern = Pattern.compile("(\\D*)(7|8)(\\D*)(?<cod1>9[0-9]{2})(\\D*)(?<cod2>[0-9]{3})(\\D*)(?<cod3>[0-9]{2})(\\D*)(?<cod4>[0-9]{2})");
        var m = pattern.matcher(number);
        if (m.find())
        {
            System.out.println("Вы ввели");
            System.out.printf("+7 %s %s-%s-%s", m.group("cod1"), m.group("cod2"), m.group("cod3"), m.group("cod4"));
        }
        else System.out.println("Что-то пошло не так");
        //Версия 1
//        String cod, cod1, cod2, cod3;
//
//        String sortNumber = number.replaceAll("[^0-9]", "");
//
//        System.out.println(sortNumber);
//
//        if (sortNumber.length() == 11)
//        {
//            cod = sortNumber.substring(1,4);
//            cod1 = sortNumber.substring(4,7);
//            cod2 = sortNumber.substring(7,9);
//            cod3 = sortNumber.substring(9);
//            System.out.printf("+7 %s %s-%s-%s", cod, cod1, cod2, cod3);
//        }
//
//        else if (sortNumber.length() == 10)
//        {
//            cod = sortNumber.substring(0,2);
//            cod1 = sortNumber.substring(3,5);
//            cod2 = sortNumber.substring(6,7);
//            cod3 = sortNumber.substring(8,9);
//            System.out.printf("+7 %s %s-%s-%s", cod, cod1, cod2, cod3);
//        }
//        else
//        {
//            System.out.println("Номер введен неполностью");
//        }
//
//        //  System.out.printf("+7 %s %s-%s-%s", cod, cod1, cod2, cod3);
    }
}
