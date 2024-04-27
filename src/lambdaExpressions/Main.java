package lambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Shubham",25,100000));
        list.add(new Employee("Rajat",24,20000));
        list.add(new Employee("Harsh",35,150000));
        list.add(new Employee("Aryan",21,40000));
        list.add(new Employee("Sumit",25,60000));

        Function<Employee,Integer> calcBonus = emp -> {
            double bonus = emp.getSalary() * 0.10;
            return (int)bonus;
        };

        Predicate<Integer> checkBonus = b -> b > 4000;
        Consumer<Employee> displayEmpInfo = emp -> {
            System.out.println("Name: " + emp.getName() + " Salary: " + emp.getSalary() + " Age: " + emp.getAge());
        };

        for(Employee emp: list){
            int bonus = calcBonus.apply(emp);
            if(checkBonus.test(bonus)){
                displayEmpInfo.accept(emp);
            }
        }
    }

}
