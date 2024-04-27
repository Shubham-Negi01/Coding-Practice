package lambdaExpressions;

import lambdaExpressions.Employee;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {
        Predicate<Integer> legalAge = (x) -> x>=18;
        System.out.println(legalAge.test(17));


        Predicate<String> greaterThanSix = (str) -> str.length() > 6;
        System.out.println(greaterThanSix.test("Shubham"));

        Employee emp = new Employee("Shubham", 25, 10000);

        Predicate<Employee> isEligibleForLoan = (e) -> e.getAge() > 18 && e.getSalary() > 20000;

        if(isEligibleForLoan.test(emp)){
            System.out.println(emp.getName() + " is eligible for a loan.");
        }
        else{
            System.out.println(emp.getName() + " is not eligible for a loan.");
        }

        //Predicate chaining
        Predicate<Integer> isEven = (x) -> x%2==0;
        Predicate<Integer> isGreaterThanTen = (x) -> x>10;

        int[] arr = {1,4,3,23,24,5,2,16,3,21};

        for(int n: arr){
            if(isEven.negate().and(isGreaterThanTen).test(n)){
                System.out.print(n + " ");
            }
        }
    }

}
