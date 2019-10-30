
public class Loader
{
    public static void main(String[] args)
    {
        Integer milkAmount = 1000; // ml
        Integer powderAmount = 1000; // g
        Integer eggsCount =1000; // items
        Integer sugarAmount = 1000; // g
        Integer oilAmount = 1000; // ml
        Integer appleCount = 1000;

        Boolean Pancaks = (milkAmount>= 1000 && powderAmount >=400 && sugarAmount>=10 &&oilAmount>=30);
        Boolean Omelette = (milkAmount>= 300 && powderAmount >=5 && eggsCount>=5);
        Boolean Applepie = (appleCount>= 3 && milkAmount>= 100 && powderAmount >=300 && eggsCount>=4);

        if (Pancaks)
        {
            System.out.println("You can do Pancakes");
        }
        if (Omelette)
        {
            System.out.println("You can do Omelette");
        }
        if (Applepie)
        {
            System.out.println("You can do Apple pie");
        }
        else
        {System.out.println("Дуй в магазин!");}

    }
}
