package basicJava;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Person {

    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Shubham",26);
        Person p2 = new Person("Shubham",27);
        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println(set);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (!name.equals(other.name))
            return false;
        return age == other.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
