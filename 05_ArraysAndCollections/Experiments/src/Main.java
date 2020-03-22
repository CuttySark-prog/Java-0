import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Main
{
    public static void main (String args[])
    {
        /*Часть1*/
        String text = "Каждый охотник желает знать, где сидит фазан";
        String[] colors = text.split(",?\\s+");

        for (int i = colors.length-1, j = 0; i >=colors.length/2 ; i--,j++) {
            String temp = colors[j];
            colors[j] = colors[i];
            colors[i] = temp;
        }

        for(String key : colors){ System.out.println(key); }

        /*Часть2 */

//        double sumTemperature = 0;
//        double[] patientTemperature = new double[30];
//
//        int healthyPatient = 0;
//
//        for(int i = 0; i< patientTemperature.length; i++)
//        {
//            patientTemperature[i] = Hospital.MIN_TEMP + ((Hospital.MAX_TEMP - Hospital.MIN_TEMP)*Math.random());
//            //   patientTemperature[i] = BigDecimal.valueOf(value).setScale(1, BigDecimal.ROUND_HALF_DOWN).doubleValue();
//            System.out.printf("%.1f; ", patientTemperature[i]);
//            sumTemperature = sumTemperature + patientTemperature[i];
//            if (patientTemperature[i] < Hospital.MAX_HEALTHY_TEMP && patientTemperature[i] > Hospital.MIN_HEALTY_TEMP)
//            {
//                healthyPatient ++;
//            }
//        }
//
//        //   double roundTemperature = BigDecimal.valueOf((sumTemperature/patientTemperature.length)).setScale(1, BigDecimal.ROUND_HALF_DOWN).doubleValue();
//        double roundTemperature = sumTemperature/patientTemperature.length;
//        System.out.printf("%n Средняя температура: %.1f %n Здоровых пациентов: %d", roundTemperature, healthyPatient);

        /*Часть3*/

        int size = 100;
//        String[][]drawX = {
//                {"*","X", " ", " ", " ", " ", " ", " ","X"},
//                {"*"," ", "X ", " ", " ", " ", "X", " "},
//                {"*", " ", " ", "X", " ", "X", " ", " "},
//                {"*", " ", " ", " ", "X", " ", " ", " "},
//                {"*", " ", " ", "X", " ", "X", " ", " "},
//                {"*", " ", "X", " ", " ", " ", "X", " "},
//                {"*","X", " ", " ", " ", " ", " ", "X"}
//        };

        //
//        for (int i = 0; i < size; i++)
//        {
//            System.out.printf("%n");
//            for (int j = 0; j<size; j++)
//            {
//                if (i == j || j == (size-i-1)) {
//                    System.out.print("X");
//                }
//                else System.out.print("  ");
//            }
//        }
    }
}
