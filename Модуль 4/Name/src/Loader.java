import java.util.Scanner;

public class Loader {
    public static void main(String args[]) {
        System.out.println("Введите ФИО: ");
        Scanner family = new Scanner(System.in);
        String enter = family.nextLine();

        String fullName = enter.trim();
      //  int itr = 1;
        int error = 0;
        int letter = 0;
        int[] numberWhitespase ;
        numberWhitespase = new int[10];

        for (int i = 0; i < fullName.length(); i++)
        {
            char currentCharacter = enter.charAt(i);
            if (!Character.isAlphabetic(currentCharacter) && !Character.isWhitespace(currentCharacter))
                error = error +1;
            if (Character.isWhitespace(currentCharacter)) {
                letter = letter + 1;
                numberWhitespase [letter-1] = i;
            //    System.out.println(numberWhitespase[0] + numberWhitespase[1]);
            }

        }
        if (letter<2)
        {
            System.out.println("Вы ввели не все данные");
        }
        if (error == 0 & letter==2)
        {
            String f = fullName.substring(0,numberWhitespase[0]);
            String n = fullName.substring(numberWhitespase[0]+1, numberWhitespase[1]);
            String s = fullName.substring(numberWhitespase[1]+1);
            System.out.printf("Фамилия: %s %nИмя: %s %nОтчество: %s %n", f, n, s);
        }

        else
        {
            System.out.println("Введены недопустимые или лишние символы");
        }
    }
}









