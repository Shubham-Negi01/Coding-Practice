package lambdaExpressions;

import lambdaExpressions.Employee;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionDemo {

    public static void main(String[] args) {

        Function<Integer,Integer> square = (n) -> n*n;

        System.out.println(square.apply(7));

        Function<String,Integer> strLen = (str) -> {
            int len = 0;
            for(char ch: str.toCharArray()){
                len++;
            }
            return len;
        };

        System.out.println(strLen.apply("Shubham"));

        Function<Employee,String> displayBonus = emp -> {
            int salary = emp.getSalary();
            double bonus =0;
            if(salary<=20000){
                bonus = salary * 0.30;
            }
            else if(salary>20000 && salary<=70000){
                bonus = salary * 0.25;
            }
            else if(salary>70000){
                bonus = salary * 0.15;
            }
            return "Bonus for salary " + salary + " is " + (int)bonus;
        };

        System.out.println(displayBonus.apply(new Employee("Shubh",25,100000)));
        System.out.println(displayBonus.apply(new Employee("Ram",19,10000)));
        System.out.println(displayBonus.apply(new Employee("Anjali",22,50000)));

        //Function chaining
        Function<Integer,Integer> tenTimes = n->n*10;

        System.out.println(square.andThen(tenTimes).apply(4)); //square->16 , tenTimes->160
        System.out.println(square.compose(tenTimes).apply(4)); //tenTimes->40 , square->1600
    }

}
