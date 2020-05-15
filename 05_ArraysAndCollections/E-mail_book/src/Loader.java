import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static HashSet<String> book = new HashSet<>();
    private static void printList()
    {
        for (String item : book) {
            System.out.println(item);
        }
    }
    public static void main(String args[])
    {
        System.out.printf("ВВедите электронный адрес%n");
        while (true)
        {
            Scanner enterAddress = new Scanner(System.in);
            String address = enterAddress.nextLine();
            Matcher matchAddress = Pattern.compile("^[a-zA-Z0-9-]+@[a-z]+\\.[a-z]+").matcher(address);
            Matcher matchExit = Pattern.compile("EXIT").matcher(address);
            Matcher matchList = Pattern.compile("LIST").matcher(address);

            if (matchAddress.matches())
            {
                book.add(matchAddress.group());
                printList();
            }
            else if (matchList.matches())
            {
                printList();
            }
            else if (matchExit.matches())
            {
                break;
            }
            else
            {
                System.out.println("Неправильный адрес");
            }
        }
    }
}
