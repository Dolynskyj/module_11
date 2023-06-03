import java.util.stream.Stream;

public class Task4 {

        public static Stream<Long> randomStream(long a, long c, long m, long seed) {
            return Stream.iterate(seed, n -> (a * n + c) % m);
        }

    }


