import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main
{
    public static void main (String args[])
    {
        System.out.printf("Введите команду: %nLIST - вывод дел с порядковыми номерами" +
                " %nADD - добавить дело в конец списка или дело на определённое место" +
                " %nEDIT - заменть дело с указанным номером" +
                " %nDELETE - удалить дело%n");
        Scanner enterNumber = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        private static void printList (ArrayList<String> list)
        {
            for (String item: list) {
                System.out.println(item);}
        }

        while (!enterNumber.equals(""))
        {
            enterNumber = new Scanner(System.in);
            String command = enterNumber.nextLine();
            Matcher matchAddIndexed = Pattern.compile("^ADD (?<dealNo>\\d+) (?<text>.+)").matcher(command);
            Matcher matchAdd = Pattern.compile("^ADD (?<text>.+)").matcher(command);
            Matcher matchExit = Pattern.compile("^EXIT").matcher(command);


            if (matchAddIndexed.matches())
            {
                System.out.println("Команда добавения дела с индексом");

                int dealNo = Integer.parseInt(matchAddIndexed.group("dealNo"));
                if(dealNo >= list.size())
                {
                    dealNo = list.size();
                }
                System.out.println("Индекс: " + dealNo);
                list.add(dealNo, matchAddIndexed.group("text"));
                printList;
            }
            else if (matchAdd.matches()) {

                System.out.println("Команда добавения дела без индекса");
                System.out.println("Текст: " + matchAdd.group("text"));
                list.add(matchAdd.group("text"));
                printList;
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
//            if (comand.equals("LIST")) {
//                //  for (String item : list_task())
//                System.out.println("Список задач");
//                continue;
//            }
//
//            if (comand.equals("DELETE")) {
//                System.out.println("задача удалена");
//                continue;
//            }
//            else
//            {
//                System.out.println("Такой команды пока нет.");
//            }

        }
    }
}
