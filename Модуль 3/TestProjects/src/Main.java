import com.skillbox.airport.Aircraft;
import com.skillbox.airport.Airport;

import java.util.ArrayList;

public class Main
{
    public static void main (String[] args)
    {
        Airport felisite = Airport.getInstance();
        System.out.println(felisite.getAllAircrafts());
       System.out.println(felisite.getAllAircrafts().toArray().length);

        System.out.println();


    }


}
