package exceptionTask;

public class ThirdClass {
    public static void exc() throws ArithmeticException{
        int a = 5;
        int b = 0;
        if(b==0){
            throw new ArithmeticException("You shall not fall!");
        }
        int zero = a / b;
    }
}
