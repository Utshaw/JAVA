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
    public static void main(String[] args) { // Anonymous inner class
        
        Phone specialPhone = new Phone() {
            public void show() {
                System.out.println("Call, SMS, EMAIL");
            }
        };
        specialPhone.show();


    }
}
```

## Acknowledgement
### Collections: 
- [Cave Of Programming](https://www.youtube.com/playlist?list=PLB841C370FAFB8EC7)
- [ Telusko](https://www.youtube.com/watch?v=JV0atjBcUv4)
- [Inner class Telusko](https://youtu.be/okruEgWGVGU)
