import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        int firstIndex = text.indexOf("Вася");
        int secondIndex = text.indexOf("Петя");
        int thirdIndex = text.indexOf("Маша");

        int sum1 = 0;
        int sum2 = 0;

        Pattern p = Pattern.compile("-?\\d+");

        Matcher m = p.matcher(text.substring(firstIndex,secondIndex));
        while (m.find()) {
            sum1 = Integer.parseInt(m.group());
          //  System.out.println(sum1);
        }

        Matcher n = p.matcher(text.substring(thirdIndex));
        while (n.find()){
            sum2 = Integer.parseInt(n.group());
          //  System.out.println(sum2);
        }

        int sum = sum1 + sum2;
        System.out.println(text);
        System.out.println("Вася и Маша в сумме заработали: " + sum);
    }
}