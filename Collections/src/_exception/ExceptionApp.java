package _exception;

public class ExceptionApp {

    public static void main(String[] args) {

        try{
            int i = 10;
            int j = 12;
            int k = i / j;
            if(k == 0) {
                throw new UtshawException("Result can't be zero");
            }
        }catch (UtshawException e) {
            e.printStackTrace();
        }catch (ArithmeticException e) {
            e.printStackTrace();
        }
    }
}
