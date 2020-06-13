import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Loader
{
    public static final ArrayList<String> carNumberList = new ArrayList<String>();
    public static final String[] letters = {"C", "M", "T", "B", "A", "P", "O", "H", "E", "Y"};
    public static List<String> generateList()
    {
        System.out.println("генерация");
//        XYZ - различные буквы, N - цифры, R - регион (от 01 до 199)
//
//        XNNNYZR - пример, A111BC197, Y777HC66


        for (int i = 1; i <= 199;i++)
        {
            if (i <= 9)
            {
                for (int y = 1; y <letters.length; y++)
                {
                    String number = letters[y-1]+y+y+y+letters[y-1]+letters[y-1]+"0"+i;
                    carNumberList.add(number);
                }
            }
            else if (i >9)
            {
                for (int y = 1; y <letters.length; y++)
                {
                    String number = letters[y-1]+y+y+y+letters[y-1]+letters[y-1]+i;
                    carNumberList.add(number);
                }
            }
            else
            {
                System.out.println("В разработке");
            }
        }
        return carNumberList;
    }
    public static void main (String[] args)
    {
        generateList();
        int g = 0;
        for (String number: carNumberList)
        {
            System.out.println(number);
            g+=1;
        }
        System.out.println(g);
    }
}
