import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static TreeMap<String, String> getNumberByName = new TreeMap<String, String>();
    private static Scanner enter = new Scanner(System.in);
    public static void main (String[] args)
    {
        for (;;)
        {
            System.out.println("Введите контакт");
            String command = enter.nextLine();
            Matcher matchAddPhone = Pattern.compile("(?<number>\\d+)").matcher(command);

            Matcher matchAddName = Pattern.compile("(?<name>(^[A-Z][a-z]+))").matcher(command);
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
            }
            else if(matchAddPhone.matches())
            {
                String phone = matchAddPhone.group();
                addPhone(phone);
            }
            else if (matchList.matches())
            {
                printMap(getNumberByName);
            }
            else
            {
                System.out.println("Ошибка");
                break;
            }
        }
    }

    public static void addName(String s)
    {
        if (getNumberByName.containsKey(s))
        {
            System.out.println(s + ": " + getNumberByName.get(s));
        }
        else
        {
            System.out.println("ВВедите номер телефона");
            String number = enter.nextLine();
            getNumberByName.put(s, number);
        }
    }
    public static void addPhone(String s)
    {
        if (getKey(s) != null)
        {
            System.out.println(getKey(s) + ": " + s);
        }
        else
        {
            System.out.println("ВВедите имя");
            String name = enter.nextLine();
            getNumberByName.put(name, s);
        }
    }
    private static void printMap(Map<String, String> map)
    {
        int n = 1;
        for (String key: map.keySet())
        {
            System.out.println(n + ". " + key + ": " + map.get(key));
            n += 1;
        }
    }
    public static String getKey(String value)
    {
        for (Map.Entry<String, String > entry : getNumberByName.entrySet())
        {
            if (entry.getValue().equals(value))
            {
                return entry.getKey();
            }
        }
        return null;
    }
}

