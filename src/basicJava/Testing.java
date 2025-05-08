package basicJava;

public class Testing extends B{

    public static void main(String[] args) {
        System.out.println(func(4));
        B obj = new B();
        obj.fn(100);
    }

    private static int func(int x) {
        try {
            if (x==5)
                throw new RuntimeException("Value cant be 5");
            return x*10;
        }
        catch (Exception e) {
            return 111;
        }
        finally {
            return 1001;
        }

    }

}
