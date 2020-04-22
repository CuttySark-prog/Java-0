import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    private static void printList (ArrayList<String> list)
    {
        for (String item: list) {
            System.out.println(item);}
    }
    public static void main (String args[])
    {
        System.out.printf("Введите команду: %nLIST - вывод дел с порядковыми номерами" +
                " %nADD - добавить дело в конец списка или дело на определённое место" +
                " %nEDIT - заменть дело с указанным номером" +
                " %nDELETE - удалить дело%n");
        Scanner enterNumber = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while (!enterNumber.equals(""))
        {
            enterNumber = new Scanner(System.in);
            String command = enterNumber.nextLine();
            Matcher matchAddIndexed = Pattern.compile("^ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchAdd = Pattern.compile("^ADD (?<text>.+)").matcher(command);
            Matcher matchExit = Pattern.compile("^EXIT").matcher(command);
            Matcher matchList = Pattern.compile("^LIST").matcher(command);
            Matcher matchEdit = Pattern.compile("^EDIT (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchDelete = Pattern.compile("^DELETE (?<dealNo>\\d+)").matcher(command);


            if (matchAddIndexed.matches())
            {
                System.out.println("Команда добавения дела с индексом");

                int dealNo = Integer.parseInt(matchAddIndexed.group("dealNo"));
                if(dealNo >= list.size())
                {
                    dealNo = list.size();
                }
                System.out.println("Индекс: " + dealNo);
                list.add((dealNo-1), matchAddIndexed.group("text"));
                printList(list);
            }
            else if (matchAdd.matches())
            {
                System.out.println("Команда добавения дела без индекса");
                System.out.println("Текст: " + matchAdd.group("text"));
                list.add(matchAdd.group("text"));
                printList(list);
            }
            else if(matchList.matches())
            {
                printList(list);
            }
            else if(matchEdit.matches())
            {
                System.out.println("Команда замены существующего дела");

                int dealNo = Integer.parseInt(matchEdit.group("dealNo"));
                if(dealNo - 1 >= list.size())
                {
                    System.out.println("Дела под таким номером нет");
                }
                else
                {
                    System.out.println("Индекс: " + dealNo);
                    list.remove(dealNo - 1);
                    list.add(dealNo - 1, matchEdit.group("text"));
                    printList(list);
                }
            }
            else  if(matchDelete.matches())
            {
                System.out.println("Команда удаления существующего дела");

                int dealNo = Integer.parseInt(matchDelete.group("dealNo"));
                if(dealNo - 1 >= list.size())
                {
                    System.out.println("Дела под таким номером нет");
                }
                else
                {
                    System.out.println("Индекс: " + dealNo);
                    list.remove(dealNo - 1);
                    printList(list);
                }
            }
            else if(matchExit.matches())
            {
                System.out.println("Завершение работы");
                break;
            }
            else
            {
                System.out.println("Invalid");
            }
        }
    }
}
