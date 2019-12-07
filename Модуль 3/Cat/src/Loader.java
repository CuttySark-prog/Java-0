
public class Loader
{

    public static void main(String[] args)
    {
        Cat murzic= new Cat();
        Cat barsic = new Cat(4500, Color.CINNAMON);
        Cat masya = new Cat(800, Color.BLUE);
        Cat fox = new Cat();
        Cat vasya = new Cat();
        Cat tig = new Cat();
        Cat leo = new Cat();

        Cat mimi = Cat.getKitten();

        System.out.println("Колличество кошек: " + Cat.getCount());

        System.out.println("Вес Мурзика до кормежки "+murzic.getWeight());
        System.out.println("Вес Барсика до кормежки "+barsic.getWeight());

        murzic.feed(10000.);

        System.out.println("Мурзика покормили:  "+murzic.getStatus());
        System.out.println("Барсика не кормили: "+barsic.getStatus());

        System.out.println("Мася " + masya.getStatus());
        System.out.println("Лиса " + fox.getStatus());
        System.out.println("Вася " + vasya.getStatus());
        System.out.println("Тиг " + tig.getStatus());
        System.out.println("Лео " + leo.getStatus());

        System.out.println("Вес Мурзика: " + murzic.getWeight());
        System.out.println("Вес Барсика: " + barsic.getWeight());
        System.out.println("Вес Маси: " + masya.getWeight());
        System.out.println("Вес Лисы: " + fox.getWeight());
        System.out.println("Вес Васи: " + vasya.getWeight());
        System.out.println("Вес Тига: " + tig.getWeight());
        System.out.println("Вес Лео: " + leo.getWeight());



//        while (barsic.getWasAlive())
//           {
//           barsic.meow();
//            }

        masya.feed(0.1);
        fox.feed(200.3);
        fox.shit();
        vasya.drink(1000.4);
        tig.drink(9000.5);
        leo.feed(300.0);
        leo.feed(100.0);
        leo.feed(150.0);
        Cat leo2 = leo.makeTwin();
        leo.drink(300.9);

        System.out.println("Вес Лео2: " + leo.getWeight());
        System.out.println("Еды в Лео2: " + leo.getTotalAmount());

        System.out.println("Лео съел: " + leo.getTotalAmount());
        System.out.println("Вес Мурзика: " + murzic.getWeight());
        System.out.println("Вес Барсика: " + barsic.getWeight());
        System.out.println("Вес Маси: " + masya.getWeight());
        System.out.println("Вес Лисы: " + fox.getWeight());
        System.out.println("Вес Васи: " + vasya.getWeight());
        System.out.println("Вес Тига: " + tig.getWeight());
        System.out.println("Вес Лео: " + leo.getWeight());

        System.out.println("Мурзик " + murzic.getStatus());
        System.out.println("Барсик " + barsic.getStatus());
        System.out.println("Мася " + masya.getStatus());
        System.out.println("Лиса " + fox.getStatus());
        System.out.println("Вася " + vasya.getStatus());
        System.out.println("Тиг " + tig.getStatus());
        System.out.println("Лео " + leo.getStatus());

        mimi.setColor(Color.BLACK);

        System.out.println("Цвет кошки Лисы: " + fox.getColor());
        System.out.println("Цвет котенка Мими: " + mimi.getColor());
        System.out.println("Вес котенка Мими: " + mimi.getWeight());

        System.out.println("Колличество кошек: " + Cat.getCount());
    }
}