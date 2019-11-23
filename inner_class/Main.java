
interface LambdaDemo {

    public void show(int i);
}


interface LambdaDemo2 {

    public void show2(int i, int j);
}

public class Main {
    public static void main(String[] args) { 
        
        LambdaDemo lambdaDemo = (int i) -> {
            System.out.println("Hello from Utshaw , Value is " + i); 
        };
        
        lambdaDemo = (int i) -> System.out.println("Hello from Utshaw, Value is " + i); // one line can be written without block

        lambdaDemo = i -> System.out.println("Hello from Utshaw, Value is " + i); // the param is int which is mentioned above so only i is fine. 
        // Moreover, only one parameter can be written without any brackets


        lambdaDemo.show(520);



        LambdaDemo2 lambdaDemo2 = (int i,int j) -> { 
            System.out.println("i = "+i + ", j = "+j);  
        };
        lambdaDemo2.show2(100, 200);

    }
}