package lambdaExpressions;

@FunctionalInterface
public interface Shape {

    int area(int side);

    default void message(){
        System.out.println("This is a Shape");
    }

}
