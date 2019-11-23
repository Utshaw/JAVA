# JAVA

## Annotations
- @Override to override a methods from parent class
- @SuppressWarnings("unchecked") to suppress warning checking inside the methods
- @Deprecated to indicate that a method is deprecated

## Java Enum
- http://tutorials.jenkov.com/java/enums.html

## Generics

## Inner class
### Inner member class
A.java
```
public class A{
    int a;

    class B {
        int b;
    }
}
```
Main.java
```
public class Main {
    public static void main(String[] args) {
        
        A a = new A();
        a.a = 100;
        A.B b = a.new B();
        b.b=500;
        System.out.println(b.b);
        
    }
}
```
### Static inner class
A.java
```
public class A{
    int a;

    static class B {
        int b;
    }
}
```
Main.java
```
public class Main {
    public static void main(String[] args) {
        
        A a = new A();
        a.a = 100;
        A.B b = new A.B();
        b.b=500;
        System.out.println(b.b);
        
    }
}
```
### Anonymous inner class
Phone.java
```
public class Phone {
    public void show() {
        System.out.println("Call");
        
    }
}
```
Main.java
```
public class Main {
    public static void main(String[] args) { // Anonymous inner class
        
        Phone specialPhone = new Phone() {
            public void show() {
                System.out.println("Call, SMS, EMAIL");
            }
        };
        specialPhone.show();

        Phone normalPhone = new Phone();
        normalPhone.show();
        
    }
}
```

#### For interface
Phone.java
```
public interface Phone {
    public void show();
}
```
Main.java
```
public class Main {
    public static void main(String[] args) { // Anonymous inner class which creates a .class file
        
        Phone specialPhone = new Phone() {
            public void show() {
                System.out.println("Call, SMS, EMAIL");
            }
        };
        specialPhone.show();


    }
}
```
### Functional Interface
[A functional interface is an interface that has just one abstract method, and thus represents a single function contract.](http://cr.openjdk.java.net/~mr/se/8/java-se-8-pfd-spec/java-se-8-jls-pfd-diffs.pdf) <br />
 

### Lambda (intoduced in JAVA 8)
Advantage: No extra class file will be created <br />
Lambdas require these functional interfaces so are restricted to their single method.
```

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
```



## Acknowledgement
### Collections: 
- [Cave Of Programming](https://www.youtube.com/playlist?list=PLB841C370FAFB8EC7)
- [ Telusko](https://www.youtube.com/watch?v=JV0atjBcUv4)
- [Inner class Telusko](https://youtu.be/okruEgWGVGU)
- [Lambda expression](https://youtu.be/yb46iD5dJYY)
