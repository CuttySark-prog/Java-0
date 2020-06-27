import java.util.*;

public class Loader
{
    public static ArrayList<String> carNumberArrayList = new ArrayList<>();
    public static TreeSet<String> carNumberTreeSet = new TreeSet<>();
    public static HashSet<String> carNumberHashSet = new HashSet<>();
    public static final String[] letters = { "A", "B", "C", "E", "H", "M", "O", "P", "T", "Y"};
    public static List<String> generateList()
    {
        System.out.println("генерация");
//        XYZ - различные буквы, N - цифры, R - регион (от 01 до 199)
//
//        XNNNYZR - пример, A111BC197, Y777HC66


        for (int x = 0; x< letters.length; x++)
        {
            for (int y =0; y < letters.length; y++)
            {
                for (int z = 0; z < letters.length; z++)
                {
                    for (int i = 1; i <= 199; i++)
                    {
                        if (i <= 9) {
                            for (int j = 1; j <= 9; j++) {
                                String number = letters[x] + j + j + j + letters[y] + letters[z] + "0" + i;
                                carNumberArrayList.add(number);
                            }
                        }
                        if (i > 9) {
                            for (int j = 1; j <= 9; j++) {
                                String number = letters[x] + j + j + j + letters[y] + letters[z] + i;
                                carNumberArrayList.add(number);
                            }
                        }
                    }
                }
            }
        }
        return carNumberArrayList;
    }

    public static void main (String[] args)
    {
        generateList();
        carNumberHashSet.addAll(carNumberArrayList);
        carNumberTreeSet.addAll(carNumberArrayList);
//        int g = 0;
//        for (String number: carNumberArrayList)
//        {
//            System.out.println(number);
//            g+=1;
//        }
//        System.out.println(g);
        Scanner scanner = new Scanner(System.in);
        for(;;)
        {
            System.out.println(carNumberArrayList.get(0));
            String findNumber = scanner.next();
            directSearchByArrayList(findNumber);
            binarySearchOnSortedArrayList(findNumber);
            searchInHashSet(findNumber);
            searchInTreeSet(findNumber);
        }
    }
    public static void directSearchByArrayList(String s)
    {
        long start = System.nanoTime();
        if (carNumberArrayList.contains(s))
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск перебором: номер найден, поиск занял" + " " + duration + "нс");
        }
        else
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск перебором: номер не найден, поиск занял" + " " + duration + "нс");
        }
    }
    public static void binarySearchOnSortedArrayList(String s)
    {
        Collections.sort(carNumberArrayList);
        long start = System.nanoTime();
        if (Collections.binarySearch(carNumberArrayList,s)>=0)
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск перебором: номер найден, поиск занял" + " " + duration + "нс");
        }
        else
        {
            long duration = System.nanoTime() - start;
            System.out.println("Бинарный поиск: номер не найден, поиск занял" + " " + duration + "нс");
        }
    }
    public static void searchInHashSet(String s)
    {
        long start = System.nanoTime();
        if (carNumberHashSet.contains(s))
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск в HashSet: номер найден, поиск занял" + " " + duration + "нс");
        }
        else
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск в HashSet: номер не найден, поиск занял" + " " + duration + "нс");
        }

    }
    public static void searchInTreeSet(String s)
    {
        long start = System.nanoTime();
        if (carNumberHashSet.contains(s))
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск в TreeSet: номер найден, поиск занял" + " " + duration + "нс");
        }
        else
        {
            long duration = System.nanoTime() - start;
            System.out.println("Поиск в TreeSet: номер не найден, поиск занял" + " " + duration + "нс");
        }
    }
}
//           Метод  	Результат	    В каких случаях хорошо использовать
//        Перебор   	 122715860нс    Если мало элементов, и поиск надо выполнить один раз
//        binarySearch	     27348нс    Если колличество элементов массива постоянно изменяется
//        TreeSet   	       450нс    Во всех остальных случаях)))
//        HashSet   	      3203нс    Если нужно проверить есть элемент или его нет

