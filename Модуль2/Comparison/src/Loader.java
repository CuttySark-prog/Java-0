import java.awt.*;

public class Loader {
    public static void main(String[] args) {
        Integer VasyaAge = 45;
        Integer MishaAge = 55;
        Integer DimaAge = 45;

        Boolean MaxVasyaAge = VasyaAge > MishaAge & VasyaAge > DimaAge;
        Boolean MaxMishaAge = MishaAge > DimaAge & MishaAge > VasyaAge;
        Boolean MaxDimaAge = DimaAge > MishaAge & DimaAge > VasyaAge;
        Boolean Mistake = VasyaAge == MishaAge || MishaAge == DimaAge || DimaAge == VasyaAge;


        Integer oldest = 0;
        Integer middle = 0;
        Integer youngest = 0;


        if (Mistake) {
            System.out.println("Возраст людей должен различаться");

        } else {
            if
            (MaxVasyaAge) {

                oldest = VasyaAge;
                if (MishaAge > DimaAge) {
                    middle = MishaAge;
                    youngest = DimaAge;
                }
                if (DimaAge > MishaAge) {
                    middle = DimaAge;
                    youngest = MishaAge;
                }
            } else if
            (MaxMishaAge) {

                oldest = MishaAge;
                if (VasyaAge > DimaAge) {
                    middle = VasyaAge;
                    youngest = DimaAge;
                }
                if (DimaAge > VasyaAge) {
                    middle = DimaAge;
                    youngest = VasyaAge;
                }
            } else if
            (MaxDimaAge) {
                oldest = DimaAge;
                if (MishaAge > VasyaAge) {
                    middle = MishaAge;
                    youngest = VasyaAge;
                }
                if (VasyaAge > MishaAge) {
                    middle = VasyaAge;
                    youngest = MishaAge;
                }

            }
            System.out.println("Most old: " + oldest);
            System.out.println("Most young: " + youngest);
            System.out.println("Middle: " + middle);
        }
    }
}