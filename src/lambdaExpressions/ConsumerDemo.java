package lambdaExpressions;

import java.util.function.Consumer;

public class ConsumerDemo {

    public static void main(String[] args) {

        Consumer<String> greet = name -> System.out.println("Hello " + name);
        Consumer<String> goodbye = name -> System.out.println("Bye " + name);
        Consumer<String> ask = name -> System.out.println("How are you " + name);

        greet.accept("Shubham");

        //chaining
        greet.andThen(ask).andThen(goodbye).accept("Naman");
    }

}
