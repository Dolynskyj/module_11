import java.util.*;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Task5 {

        public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
            Random random = new Random();
            List<T> firstList = first.collect(Collectors.toList());
            List<T> secondList = second.collect(Collectors.toList());

            long zipSize = Math.min(firstList.size(), secondList.size());
            List<T> zip = new ArrayList<T>();

            for(int i = 0; i < zipSize; i++){
            zip.add(firstList.get(random.nextInt(firstList.size())));
            zip.add(secondList.get(random.nextInt(secondList.size())));
            }
            Stream<T> result = zip.stream();
            return result;
        }

    }

