import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static TreeMap<String, String> phoneList = new TreeMap();
    private static ArrayList <String> nameList = new ArrayList<>();
    public static void main (String args[])
    {
        for (;;)
        {
            System.out.println("Введите контакт");
            Scanner enter = new Scanner(System.in);
            String command = enter.nextLine();
            Matcher matchAddPhone = Pattern.compile("(?<number>\\d+)").matcher(command);
            Matcher matchAddName = Pattern.compile("(?<name>(^[A-Z]{1}[a-z]+))").matcher(command);
            Matcher matchList = Pattern.compile("LIST").matcher(command);
            Matcher matchExit = Pattern.compile("EXIT").matcher(command);

            if (matchExit.matches())
            {
                System.out.println("end");
                break;
            }
            else if (matchAddName.matches())
            {
                String name = matchAddName.group();
                addName(name);
                continue;
            }
            else if(matchAddPhone.matches())
            {
                String phone = matchAddPhone.group();
                addPhone(phone);
                continue;
            }
            else if (matchList.matches())
            {
                System.out.println("print");
                printMap(phoneList);
            }
            else
            {
                System.out.println("Ошибка");
                break;
            }
        }
    }

    public static String addName(String s)
    {

        if (nameList.contains(s))
        {
            printMap(phoneList);
        }
        else
        {
            System.out.println("ВВедите номер телефона");
            Scanner phoneNumber = new Scanner(System.in);
            String number = phoneNumber.nextLine();
            phoneList.put(number, s);
        }
        return s;
    }
    public static String addPhone(String s)
    {
        if (phoneList.containsKey(s))
        {
            printMap(phoneList);
        }
        else
        {
            String number = s;
            System.out.println("ВВедите имя");
            Scanner phoneName = new Scanner(System.in);
            String name = phoneName.nextLine();
            phoneList.put(number, name);
        }
        return s;
    }
    private static void printMap(Map<String, String> map)
    {
        for (String key: map.keySet())
        {
            System.out.println(map.get(key) + ": " + key);
        }
    }
}

