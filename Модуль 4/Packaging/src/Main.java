public class Main
{
    public static void main (String args[])
    {
        int box = 577;

        double truckCapacity = 12;
        double containerCapacity = 27;

        int container = (int)(Math.ceil(box/containerCapacity));
      //  System.out.println(container);

        int truck =(int)(Math.ceil(container/truckCapacity));
     //   System.out.println(truck);

        int a = 0;
        int b = 0;

        for (int i = 1; i <= truck; i ++)
        {
            System.out.println("Грузовик " + i);
            for (int x = 1; x <= truckCapacity; x ++)
            {
                b = 1 + b;
                if (b <= container)
                System.out.println("    Контейнер " + b );

                for ( int y = 1 ; y <= containerCapacity; y ++)
                {
                    a = 1 + a;
                    if (a <= box)
                        System.out.println("        Коробка " + a);
                }

            }
        }
    }
}
