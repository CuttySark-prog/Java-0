import static java.lang.StrictMath.ulp;

public class Main
{
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;

    public static void main (String[] args)
    {
        System.out.println("Максимальное значение типа Integer: " + Integer.MAX_VALUE);
        System.out.println("Минимальное значение типа Integer: " + Integer.MIN_VALUE);
        System.out.println("Максимальное значение типа Byte: " + Byte.MAX_VALUE);
        System.out.println("Минимальное значение типа Byte: " + Byte.MIN_VALUE);
        System.out.println("Максимальное значение типа Long: " + Long.MAX_VALUE);
        System.out.println("Минимальное значение типа Long: " + Long.MIN_VALUE);
        System.out.println("Максимальное значение типа Short: " + Short.MAX_VALUE);
        System.out.println("Минимальное значение типа Short: " + Short.MIN_VALUE);
        System.out.println("Максимальное значение типа Float: " + Float.MAX_VALUE);
        System.out.println("Минимальное значение типа Float: ");
        System.out.println(ulp(0));
        System.out.println("Максимальное значение типа Double: " + Double.MAX_VALUE);

        System.out.println("Минимальное значение типа Double: " + NEGATIVE_INFINITY);
        double d = -Double.MAX_VALUE -0.00006;
        System.out.println(d);
    }
}
