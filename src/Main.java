import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Pawlo", "Jaroslaw", "Oleksandr", "Wolodymyr", "Ivan", "Dmitry", "Irma");

//        Завдання 1
        Task1 task1 = new Task1();
        System.out.println("Завдвння 1\n" + task1.filteresName(names));

//        Завдання 2
        Task2 task2 = new Task2();
        System.out.println("Завдвння 2\n" + task2.sortetNames(names));

//        Завдання 3
        int[] numbers = {3, 5, 9, 1, 7, 14, 2};
        Task3 task3 = new Task3();
        System.out.println("Завдвння 3\n" + task3.sortetArreys(numbers));

//        Завдання 4
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);
        long seed = 0L;
        Task4 task4 =new Task4();
        Stream<Long> randomStream = task4.randomStream(a, c, m, seed);
        System.out.println("Завдвння 4");
        randomStream.limit(10).forEach(System.out::println);

//        Завдання 5
            Stream<Integer> firstStream = Stream.of(1, 2, 3, 4, 5);
            Stream<Integer> secondStream = Stream.of(6, 7, 8);
            Task5 task5 = new Task5();
            Stream<Integer> zippedStream = task5.zip(firstStream, secondStream);
        System.out.println("Завдвння 5");
            zippedStream.forEach(System.out::println);

    }
}
