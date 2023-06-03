import java.util.Arrays;

public class Task3 {
    public String sortetArreys(int[] numbers){
        return Arrays.toString(Arrays.stream(numbers).sorted().toArray());
    }
}
