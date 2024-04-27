package lambdaExpressions;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        Supplier<Date> d = () -> new Date();
        System.out.println(d.get());

    }

}
