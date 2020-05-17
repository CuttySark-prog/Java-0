import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static TreeMap<String, String> phoneList = new TreeMap();
    public static void main (String args[])
    {
        System.out.println("Введите контакт");
        Scanner enter = new Scanner(System.in);

        while (true)
        {
            String command = enter.nextLine();
            Matcher matchAddPhone = Pattern.compile("(?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchAddName = Pattern.compile("(?<text>.+)").matcher(command);
            Matcher matchList = Pattern.compile("LIST").matcher(command);
            Matcher matchExit = Pattern.compile("EXIT").matcher(command);

            if (matchAddName.matches())
            {

            }
            else if(matchAddPhone.matches())
            {

            }
            else if (matchList.matches())
            {
                System.out.println("print");
                printMap(phoneList);
            }
            else if (matchExit.matches())
            {
                System.out.println("end");
                break;
            }
            else
            {
                System.out.println("Ошибка");
                break;
            }
          //  break;
        }
    }

    public static Map addName(Map<String, String> phoneList)
    {
        return phoneList;
    }
    public static Map addPhone(Map<String, String> phoneList)
    {

        return phoneList;
    }
    private static void printMap(Map<String, String> map)
    {
        for (String key: map.keySet())
        {
            System.out.println(key + ": " + map.get(key));
        }
    }
}

