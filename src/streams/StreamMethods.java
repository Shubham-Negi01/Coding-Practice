package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMethods {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(20,50,60,70,30,670,60,50,30,70,40,98);
        List<String> str = Arrays.asList("car","bus","train");

        List<Integer> distinct = nums.stream().distinct().collect(Collectors.toList());

        //System.out.println(distinct);

        //nums.stream().limit(8).forEach(System.out::println);
        long even = nums.stream().filter(n->n%2==0).count();

        //System.out.println("Even nos count: " + even);

        Optional minimum = nums.stream().min((o1, o2) -> o1.compareTo(o2));

       // System.out.println("min no. - " + minimum.orElse(0));

        //sorted()
        List<Integer> sortedList = nums.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

//        System.out.println(sortedList);

        //anyMatch()

//        System.out.println(nums.stream().allMatch(z->z>10));

        Optional<Integer> f = nums.stream().findAny();
        //System.out.println(f.get());

        //Stream concatenation
        List<String> names1 = Arrays.asList("Shubham","Naman","Aswal");
        List<String> names2 = Arrays.asList("Sneha","Abhishek","Shivani");

        List<String> namesWithSurname = Stream.concat(names1.stream(),names2.stream()).map(n -> n + " Singh").collect(Collectors.toList());

        System.out.println(namesWithSurname);

    }

}
