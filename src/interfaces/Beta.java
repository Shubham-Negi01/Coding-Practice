package interfaces;

public interface Beta extends Alpha{

    default public void reset(){
        System.out.println("Beta implementation");
    }

}
