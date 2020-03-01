import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        String salary = text.replaceAll("[^0-9]", " ");
        System.out.println(salary);
        String[] salarys = salary.split("\\s+");
        int sum = 0;
//        for (int i = 0; i < salarys.length; i++)
//        {
//          System.out.println(salarys[i]);
//          sum = sum + Integer.parseInt(Arrays.toString(salarys));
//        }

//   //     int numArr[] = new int[salarys.length];
//   //     for (int i = 0; i < salarys.length; i++) {
//   //         numArr[i] = Integer.parseInt(salarys[i]);
//   //         System.out.println(numArr[i]);
//   //     }

        System.out.println(text);
        System.out.println("Вася и Маша в сумме заработали: " + sum);
    }
}