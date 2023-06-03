import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {


    public String filteresName(List<String> names){
        String result = IntStream.range(0, names.size())
                                .filter(i -> i % 2 == 0)
                                .mapToObj(i -> (i+1) + "," + names.get(i) + " ")
                                .collect(Collectors.joining());
        return result;
    }
}
