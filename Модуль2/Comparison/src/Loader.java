import java.awt.*;

public class Loader
{
    public static void main (String[] args)
    {
        Integer VasyaAge=33;
        Integer MishaAge =44;
        Integer DimaAge =55;

        Boolean MaxVasyaAge = VasyaAge > MishaAge &  VasyaAge > DimaAge;
        Boolean MaxMishaAge =  MishaAge > DimaAge & MishaAge > VasyaAge;
        Boolean MaxDimaAge = DimaAge > MishaAge & DimaAge > VasyaAge;

        Integer oldest = 0;
        Integer middle = 0;
        Integer youngest  = 0;

        if
         ( MaxVasyaAge)
        {

             oldest = VasyaAge;
            if (MishaAge>DimaAge)
            {
                 middle = MishaAge;
                 youngest = DimaAge;
            }
            else
            {
                 middle = DimaAge;
                 youngest = MishaAge;
            }
        }

        if
        ( MaxMishaAge)
        {
             oldest = MishaAge;
            if (VasyaAge>DimaAge)
            {
                 middle = VasyaAge;
                 youngest = DimaAge;
            }
            else
            {
                middle = DimaAge;
                youngest = VasyaAge;
            }
        }
        if
        ( MaxDimaAge)
        {
            oldest = DimaAge;
            if (MishaAge>VasyaAge)
            {
                middle = MishaAge;
                youngest = VasyaAge;
            }
            else
            {
                middle = VasyaAge;
                youngest = MishaAge;
            }
            System.out.println ("Most old: " + oldest);
            System.out.println ("Most young: " + youngest);
            System.out.println ("Middle: " + middle);
        }
        else System.out.println("Возраст людей должен различаться");




    }
}
