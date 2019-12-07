
public class Main
{
    public static void main(String[] args)
    {
        Container container = new Container();
        container.count += 7843;
        int number = container.count;
        int summ = sumDigits(555);
        System.out.println(summ);
    }

    public Integer sumDigits(Integer number)
    {
        String s = Integer.toString(number);
 //       System.out.println(s.charAt(1));
   //     System.out.println(s.length());
 //       int index = s.();
        Integer sum = Character.getNumericValue(s.charAt(0)) + Character.getNumericValue(s.charAt(1)) + Character.getNumericValue(s.charAt(2)) + Character.getNumericValue(s.charAt(3));
 //       System.out.println(sum);
        return sum;
    }
}
