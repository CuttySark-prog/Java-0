import java.lang.reflect.Array;
import java.util.ArrayList;

public class Loader
{
    public static final ArrayList<String> carNumber = new ArrayList<String>();
    public static final String[] letters = {"C", "M", "T", "B", "A", "P", "O", "H", "E", "Y"};
    public static void generateList()
    {
        for (int i = 1; i == 199;i++)
        {
            if (i <= 9)
            {
                for (int y = 0; y >=letters.length; y++)
                {
                    carNumber.add(letters[y]+i+i+i+letters[y]+letters[y]+"0"+i);
                }
            }
        }
    }
    public static void main (String[] args)
    {
        generateList();
        carNumber.add("начало");
        for (String number: carNumber)
        {
            System.out.println(number);
        }
    }
}
