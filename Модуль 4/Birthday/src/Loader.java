import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Loader
{
    public static void main(String[] args)
    {
        LocalDate birthdayDate = LocalDate.of(1986, 8, 25);
        LocalDate date = LocalDate.now();
        Period age = Period.between(birthdayDate,date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.println(age.getYears());

        for (int i = 0; i <= age.getYears(); i++)
        {
            
            System.out.printf("%d - %s - %s%n", i, birthdayDate.format(formatter), birthdayDate.getDayOfWeek());
            birthdayDate = birthdayDate.plusYears(1);
        }
    }
}
