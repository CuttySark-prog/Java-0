
public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        System.out.println(sumDigits(1234567));
    }

    public static Integer sumDigits(Integer number)
    {
        String s = Integer.toString(number);

        int itr;;
        int sum =0;

        for  (itr = s.length() ; itr != 0;   itr = itr - 1)
        {
            sum += Character.getNumericValue(s.charAt(itr-1));
        }
        return sum;
    }
}

