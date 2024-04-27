package streams;

import java.sql.Time;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamsDemo {

    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Baleno",130),
                new Car("Nexon",170),
                new Car("Altroz",160),
                new Car("Polo",140),
                new Car("i20",140),
                new Car("City",200),
                new Car("Slavia",180),
                new Car("Virtus",180)

        );

        List<Car> topCars = cars.parallelStream().filter(c -> c.getTopSpeed() > 150).limit(3).collect(Collectors.toList());

    }

}
