package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {

    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("Car","Bike","Scooty","Rickshaw");
        List<String> ucVeh = vehicles.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(ucVeh);
        List<Integer> lengths = vehicles.stream().map(String::length).collect(Collectors.toList());
        System.out.println(lengths);
        List<Integer> nums = Arrays.asList(3,6,12,7,8);
        nums.stream().map(n->n*3).forEach(System.out::println);

        List<Product> products = Arrays.asList(
                new Product(1,"Ball",1200),
                new Product(2,"Shoes",10000),
                new Product(3,"Socks",300),
                new Product(4,"Shorts",800),
                new Product(5,"Band",200)
        );

        products.stream().filter(p->p.getPrice()<500).forEach(p-> System.out.print(p.getPrice()+" "));
    }

}
