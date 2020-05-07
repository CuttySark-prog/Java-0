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
        Scanner enterNumber;
        while (true)
        {
            enterNumber = new Scanner(System.in);
            String address = enterNumber.nextLine();
            Matcher matchAddress = Pattern.compile("^(?<name>.+)@(?<box>.+).(?<end>.+)").matcher(address);

            if (matchAddress.matches())
            {
                book.add(address);
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
