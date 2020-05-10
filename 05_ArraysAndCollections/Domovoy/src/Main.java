import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    private static ArrayList<String> list = new ArrayList<>();

    private static void printList ()
    {
        for (String item: list)
        {
            System.out.println(item);
        }
    }

    private static int scanIndex(Matcher m)
    {
        int dealNo = Integer.parseInt(m.group("dealNo"));
        if(dealNo - 1 > list.size())
        {
            System.out.println("Дела под таким номером нет");
            return -1;
        }
        else if(dealNo  <= 0)
        {
            System.out.println("Используйте, пожалуйста, натуральные числа");
            return -1;
        }
        else
        {
            return dealNo;
        }
    }

    public static void main (String args[])
    {
        System.out.printf("Введите команду: %nLIST - вывод дел с порядковыми номерами" +
                " %nADD - добавить дело в конец списка или дело на определённое место" +
                " %nEDIT - заменть дело с указанным номером" +
                " %nDELETE - удалить дело%n");
        Scanner enterNumber;

        while (true)
        {
            enterNumber = new Scanner(System.in);
            String command = enterNumber.nextLine();
            Matcher matchAddIndexed = Pattern.compile("^ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchAdd = Pattern.compile("^ADD (?<text>.+)").matcher(command);
            Matcher matchExit = Pattern.compile("EXIT").matcher(command);
            Matcher matchList = Pattern.compile("LIST").matcher(command);
            Matcher matchEdit = Pattern.compile("^EDIT (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchDelete = Pattern.compile("^DELETE (?<dealNo>\\d+)").matcher(command);

            if (matchAddIndexed.matches())
            {
                System.out.println("Команда добавения дела с индексом");

                int index = scanIndex(matchAddIndexed);
                if (index != -1)
                    {
                        System.out.println("Индекс: " + index);
                        list.add((index-1), matchAddIndexed.group("text"));
                        printList();
                    }
            }
            else if (matchAdd.matches())
            {
                System.out.println("Команда добавения дела без индекса");
                System.out.println("Текст: " + matchAdd.group("text"));
                list.add(matchAdd.group("text"));
                printList();
            }
            else if(matchList.matches())
            {
                printList();
            }
            else if(matchEdit.matches())
            {
                System.out.println("Команда замены существующего дела");

                int index = scanIndex(matchEdit);
                if (index != - 1)
                {
                    System.out.println("Индекс: " + index);
                    list.add((index-1), matchEdit.group("text"));
                    printList();
                }
            }
            else  if(matchDelete.matches())
            {
                System.out.println("Команда удаления существующего дела");

                int index = scanIndex(matchDelete);
                if (index != -1)
                {
                    System.out.println("Индекс: " + (index));
                    list.remove(index - 1);
                    printList();
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
