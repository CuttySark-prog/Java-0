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

        Pattern pattern = Pattern.compile("(//+7,8)?([0-9]{3})([0-9]{3})([0-9]{2}])([0-9]{2})");
        Matcher matcher = pattern.matcher(number);
      //  String num  =  matcher.replaceAll( "s");
        var m = pattern.compile("(/+7,/8)?([0-9]{3})([0-9]{3})([0-9]{2}])([0-9]{2})").matcher(number);
        if (m.find())
        {
            System.out.println("Вы ввели");
            System.out.printf("+7 %s %s-%s-%s", m.group(2), m.group(3), m.group(4), m.group(5));
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
