import java.util.*;

public class Loader
{
    public static List<String> generateList()
    {
        System.out.println("генерация");
        String[] letters = { "A", "B", "C", "E", "H", "M", "O", "P", "T", "Y"};
        ArrayList<String> carNumberArrayList = new ArrayList<>();
        for (int x = 0; x< letters.length; x++)
        {
            for (int y =0; y < letters.length; y++)
            {
                for (int z = 0; z < letters.length; z++)
                {
                    for (int i = 1; i <= 199; i++)
                    {
                        if (i <= 9) {
                            for (int j = 1; j <= 9; j++)
                            {
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
        List<String> carNumberArrayList = generateList();

        Scanner scanner = new Scanner(System.in);
        for(;;)
        {
            String findNumber = scanner.next();
            directSearchByArrayList(findNumber,carNumberArrayList);
            binarySearchOnSortedArrayList(findNumber, carNumberArrayList);
            searchInHashSet(findNumber, carNumberArrayList);
            searchInTreeSet(findNumber, carNumberArrayList);
        }
    }
    public static void directSearchByArrayList(String s,List findList)
    {
        long start = System.nanoTime();
        if (findList.contains(s))
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
    public static void binarySearchOnSortedArrayList(String s,List findList)
    {
        Collections.sort(findList);
        long start = System.nanoTime();
        if (Collections.binarySearch(findList,s)>=0)
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
    public static void searchInHashSet(String s, List carNumberArrayList)
    {
        HashSet<String> carNumberHashSet = new HashSet<>();
        carNumberHashSet.addAll(carNumberArrayList);
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
    public static void searchInTreeSet(String s, List carNumberArrayList)
    {
        TreeSet<String> carNumberTreeSet = new TreeSet<>();
        carNumberTreeSet.addAll(carNumberArrayList);
        long start = System.nanoTime();
        if (carNumberTreeSet.contains(s))
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

