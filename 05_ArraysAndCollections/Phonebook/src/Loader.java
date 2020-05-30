import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static TreeMap<String, String> phoneList = new TreeMap();
    private static ArrayList <String> nameList = new ArrayList<>();
    private static Scanner enter = new Scanner(System.in);
    public static void main (String args[])
    {
        for (;;)
        {
            System.out.println("Введите контакт");
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
            }
            else if(matchAddPhone.matches())
            {
                String phone = matchAddPhone.group();
                addPhone(phone);
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
           System.out.println(s + ": " + getKey(phoneList,s));

        }
        else
        {
            System.out.println("ВВедите номер телефона");
            String number = enter.nextLine();
            phoneList.put(number, s);
            nameList.add(s);
        }
        return s;
    }
    public static String addPhone(String s)
    {
        if (phoneList.containsKey(s))
        {
            System.out.println(phoneList.get(s) + ": " + s);
        }
        else
        {
            String number = s;
            System.out.println("ВВедите имя");
            String name = enter.nextLine();
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
    public static <phone, name> phone getKey(Map<phone, name> map, name value)
    {
        for (Map.Entry<phone, name> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
}

