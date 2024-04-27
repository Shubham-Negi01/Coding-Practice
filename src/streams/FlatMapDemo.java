package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo {

    public static void main(String[] args) {

        List<List<Integer>> marks = new ArrayList<>() ;
        marks.add(Arrays.asList(1,2));
        marks.add(Arrays.asList(3,4));
        marks.add(Arrays.asList(5,6));
        marks.add(Arrays.asList(7,8));

        //marks.stream().flatMap(l->l.stream().map(x->x*x)).forEach(System.out::println);

        List<Student> list1 = Arrays.asList(
                new Student("Shubham","CSE",7),
                new Student("Ankur","ME",5),
                new Student("Vijay","ME",5)
        );

        List<Student> list2 = Arrays.asList(
                new Student("Qwert","CSE",7),
                new Student("Abhishek","CE",7),
                new Student("Ayush","EE",1)
        );

        List<Student> list3 = Arrays.asList(
                new Student("Umang","ECE",6),
                new Student("Prateek","CE",4),
                new Student("Rahul","ECE",8)
        );

        List<List<Student>> listCollection = Arrays.asList(list1,list2,list3);

        listCollection.stream().flatMap(list->list.stream().filter(s->s.getDeptt().equalsIgnoreCase("cse"))).forEach(s-> System.out.println(s.getName()));

    }

}
