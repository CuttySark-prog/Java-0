import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
//        String salary = text.replaceAll("[^0-9]", " ");
//        String sal = salary.trim();
//        String[] salarys = sal.split("\\s+");
        //Вариант 2
        var m = Pattern.compile("(\\d+)(\\d+)(\\d+)").matcher(text);
        if (m.find()) {
            System.out.println("Зарплата Васи: " + m.group(1));
            System.out.println("Зарплата Пети: " + m.group(2));
            System.out.println("Зарплата Маши: " + m.group(3));
            System.out.println("Все вместе заработали: " + (Integer.parseInt(m.group(1))+Integer.parseInt(m.group(2)) + Integer.parseInt(m.group(3))));
        }

            //Вариант 1
//        int sum = 0;
//        for (int i = 0; i < salarys.length; i++)
//        {
//          System.out.println(salarys[i]);
//          sum = sum + Integer.parseInt(salarys[i]);
//        }
//
//        System.out.println(text);
//        System.out.println("Вася и Маша в сумме заработали: " + sum);
    }
}