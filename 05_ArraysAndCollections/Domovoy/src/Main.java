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

    private static int scanIndex(int dealNo)
    {
//        int dealNo = Integer.parseIntIndex(m.group("dealNo"));
//        int dealNo = Integer.parseEdit(m.group("dealNo"));
//        int dealNo = Integer.parseDelete(m.group("dealNo"));
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
            return 1;
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

                int dealNo = Integer.parseInt(matchAddIndexed.group("dealNo"));
                scanIndex(dealNo);
                if (scanIndex(dealNo) == 1)
                    {
                        System.out.println("Индекс: " + (dealNo));
                        list.add((dealNo - 1), matchAddIndexed.group("text"));
                        printList();
                    }
                else if (scanIndex(dealNo) == - 1)
                {
                    continue;
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

                int dealNo = Integer.parseInt(matchEdit.group("dealNo"));
                scanIndex(dealNo);

                if (scanIndex(dealNo) == 1)
                {
                    System.out.println("Индекс: " + (dealNo));
                    list.add((dealNo - 1), matchEdit.group("text"));
                    printList();
                }
                else if (scanIndex(dealNo) == -1)
                {
                    continue;
                }
            }
            else  if(matchDelete.matches())
            {
                System.out.println("Команда удаления существующего дела");

                int dealNo = Integer.parseInt(matchDelete.group("dealNo"));
                scanIndex(dealNo);
                if (scanIndex(dealNo) == 1)
                {
                    System.out.println("Индекс: " + (dealNo));
                    list.add((dealNo - 1), matchDelete.group("text"));
                    printList();
                }
                else if (scanIndex(dealNo) == -1)
                {
                    continue;
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
