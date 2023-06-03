import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> sortetNames(List<String> names) {
           List<String> filteredNames = names.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        return filteredNames;
    }
}
