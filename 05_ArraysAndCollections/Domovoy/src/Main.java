import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main (String args[]) {
        System.out.printf("Введите команду: %nLIST - вывод дел с порядковыми номерами" +
                " %nADD - добавить дело в конец списка или дело на определённое место" +
                " %nEDIT - заменть дело с указанным номером" +
                " %nDELETE - удалить дело%n");
        Scanner enterNumber = new Scanner(System.in);
        while (!enterNumber.equals(" ")) {
            enterNumber = new Scanner(System.in);
            String comand = enterNumber.nextLine();

            if (comand.equals("LIST")) {
                //  for (String item : list_task())
                System.out.println("Список задач");
                continue;
            }
            if (comand.equals("ADD")) {
                System.out.println("добавлено ");
                continue;
            }
            if (comand.equals("EDIT")) {
                System.out.println("задача заменена на ");
                continue;
            }

            if (comand.equals("DELETE")) {
                System.out.println("задача удалена");
                continue;
            }
            else
            {
                System.out.println("Такой команды пока нет.");
            }
        }
    }
}
