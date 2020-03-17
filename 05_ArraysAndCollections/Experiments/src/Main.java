import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main
{
    public static void main (String args[])
    {
        /*Часть1*/
//        String text = "Каждый охотник желает знать, где сидит фазан";
//        String[] colors = text.split(",?\\s+");
//        for(int i = 0; i < colors.length; i++)
//        {
//            System.out.println(colors[(colors.length-i-1)]);
//        }

        /*Часть2 - Не очень довольна найденным решением, так как система пишет,
         что оно устаревшее, но другого способа округлить до десятых я не нашла.
         Да и как это работает, честно говоря не совем понимаю.*/
//        double sumTemperature = 0;
//        double[] patientTemperature = new double[30];
//        int healthyPatient = 0;
//
//        for(int i = 0; i< patientTemperature.length; i++)
//        {
//            double value = 32.0 + (10*Math.random());
//            patientTemperature[i] = BigDecimal.valueOf(value).setScale(1, BigDecimal.ROUND_HALF_DOWN).doubleValue();
//            System.out.print(patientTemperature[i] + ", ");
//            sumTemperature = sumTemperature + value;
//            if (value < 36.9 && value > 36.2)
//            {
//                healthyPatient = +1;
//            }
//        }
//
//        double roundTemperature = BigDecimal.valueOf((sumTemperature/patientTemperature.length)).setScale(1, BigDecimal.ROUND_HALF_DOWN).doubleValue();
//        System.out.printf("%n Средняя температура: %.1f %n Здоровых пациентов: %d", roundTemperature, healthyPatient);

        /*Часть3*/

        String[][]drawX = {
                {"*","X", " ", " ", " ", " ", " ", " ","X"},
                {"*"," ", "X ", " ", " ", " ", "X", " "},
                {"*", " ", " ", "X", " ", "X", " ", " "},
                {"*", " ", " ", " ", "X", " ", " ", " "},
                {"*", " ", " ", "X", " ", "X", " ", " "},
                {"*", " ", "X", " ", " ", " ", "X", " "},
                {"*","X", " ", " ", " ", " ", " ", "X"}
        };
        for (int i = 0; i < drawX.length; i++)
        {
            System.out.println("");
            for (int j = 0; j<drawX[i].length; j++)
            {
                System.out.printf(drawX[i][j]);
            }
        }


    }
}
