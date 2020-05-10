import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static HashSet<String> book = new HashSet<>();
    public static void main(String args[])
    {
        System.out.printf("ВВедите электронный адрес%n");
        Scanner enterAddress;
        while (true)
        {
            enterAddress = new Scanner(System.in);
            String address = enterAddress.nextLine();
            Matcher matchAddress = Pattern.compile("^ADD (?<mail>.(?<name>.+)@(?<box>.+)\\.(?<end>.+))").matcher(address);
            Matcher matchList = Pattern.compile("^LIST").matcher(address);
            if (matchList.matches())
            {
                for (String item : book) {
                    System.out.println(item);
                }
            }
            if (matchAddress.matches())
            {
                book.add(matchAddress.group());
               for (String book: book)
               {
                   System.out.println(book);
               }
            }
//            else if ()
//            {
//
//            }
            else
            {
                System.out.println("Неправильный адрес");
                continue;
            }


        }
    }
}
