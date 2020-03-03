import java.util.Scanner;

public class Loader
{
    public static void main (String args[])
    {
        System.out.println("Введите номер телефона: ");
        Scanner enterNumber = new Scanner(System.in);
        String number = enterNumber.nextLine();
        String cod, cod1, cod2, cod3;

        String sortNumber = number.replaceAll("[^0-9]", "");

        System.out.println(sortNumber);

        //char first = sortNumber.charAt(0);

        if (sortNumber.length() == 11)
        {
            cod = sortNumber.substring(1,4);
            cod1 = sortNumber.substring(4,7);
            cod2 = sortNumber.substring(7,9);
            cod3 = sortNumber.substring(9);
            System.out.printf("+7 %s %s-%s-%s", cod, cod1, cod2, cod3);
        }

        else if (sortNumber.length() == 10)
        {
            cod = sortNumber.substring(0,2);
            cod1 = sortNumber.substring(3,5);
            cod2 = sortNumber.substring(6,7);
            cod3 = sortNumber.substring(8,9);
            System.out.printf("+7 %s %s-%s-%s", cod, cod1, cod2, cod3);
        }
        else
        {
            System.out.println("Номер введен неполностью");
        }

        //  System.out.printf("+7 %s %s-%s-%s", cod, cod1, cod2, cod3);
    }
}
