import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Loader
{
    private static TreeMap<String, String> nameList = new TreeMap();
    private static ArrayList <String> phoneList = new ArrayList<>();
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
                printMap(nameList);
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
        if (nameList.containsKey(s))
        {
            System.out.println(s + ": " + nameList.get(s));
        }
        else
        {
            System.out.println("ВВедите номер телефона");
            String number = enter.nextLine();
            nameList.put(s, number);
            phoneList.add(number);
        }
        return s;
    }
    public static String addPhone(String s)
    {
        System.out.println("введен номер");
        if (phoneList.contains(s))
        {
            System.out.println(getKey(nameList, s) + ": " + s);
        }
        else
        {
            String number = s;
            System.out.println("ВВедите имя");
            String name = enter.nextLine();
            nameList.put(name, number);
            phoneList.add(number);
        }
        return s;
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
    public static <name, phone> name getKey(Map<name, phone> map, phone value)
    {
        for (Map.Entry<name, phone> entry : map.entrySet()) {
            if (entry.getValue().equals(value)) {
                return entry.getKey();
            }
        }
        return null;
    }
//    public static void printPhoneList ()
//    {
//        for (String item: phoneList)
//        {
//            System.out.println(item);
//        }
//    }
}

