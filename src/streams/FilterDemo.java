package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class FilterDemo {

    public static void main(String[] args) {
        /*List<Integer> list = Arrays.asList(10,11,12,13,14,15,16);
        List<Integer> evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());

        System.out.println(evenList);

        list.stream().filter(n -> n % 2 == 1).forEach(System.out::println);*/

        /*List<String> names = Arrays.asList("Shubham", null, "Naman", "Sneha", null, "Abhishek");

        names.stream().filter(Objects::nonNull).forEach(System.out::println);*/

        List<Product> products = Arrays.asList(
                new Product(1,"Ball",600),
                new Product(2,"Shoes",6000),
                new Product(3,"Shorts",800),
                new Product(4,"Racket",5000)
        );

        products.stream().filter(p->p.getPrice()>1000).forEach(p-> System.out.println(p.getPrice()));
    }


}
