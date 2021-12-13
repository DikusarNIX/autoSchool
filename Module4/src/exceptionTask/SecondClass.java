package exceptionTask;

public class SecondClass {
    public static void exc(){
        try {
            int zero = 5 / 0;
        } catch (Exception e) {
            System.out.println("You shall not fall!");
        }
    }
}
