# JAVA
## Installation
- Recommended to install JDK 11 as it is LTS
### Java JDK 11 LTS
#### Ubuntu
- [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) install tar.gz file from [here](https://www.oracle.com/java/technologies/javase-downloads.html) <br />
Enter commands:
```
tar -xvf jdk-11.0.6_linux-x64_bin.tar.gz 
```
```
sudo mkdir -p /usr/lib/jvm/jdk-11/
```
```
sudo mv jdk-11.0.6/* /usr/lib/jvm/jdk-11/
```
```
sudo update-alternatives --install "/usr/bin/java" "java" "/usr/lib/jvm/jdk-11/bin/java" 1010
```
```
 sudo update-alternatives --install "/usr/bin/javac" "javac" "/usr/lib/jvm/jdk-11/bin/javac" 1010
```
## Intellij Idea
### Choosing project SDK
- File -> Project Structure -> Project SDK -> Choose the parent folder of bin folder for jdk, On Ubuntu the path is `/usr/lib/jvm/jdk-11`
- Chose project language level same as the project sdk. If the jdk is 11 then the language level will be 11 too.
### Some settings
- File -> Settings -> Auto Import; Check `Add unabmigous import on the fly`, `Optimize imports on the fly`
- File -> Settings -> Code Folding: Uncheck `Imports`, `One-line methods`, `Closures`, `Generic constructor ...`

## Data types
### Primitive data types
#### int 4 bytes
-  	-2147483,648 to 2147483647
#### short  	2 bytes
-  	-32768 to 32767
#### byte 1 byte
- -128 to 127
#### long  	8 bytes
- -9223372036854775808L to
9223372036854775807L
#### float 4 bytes
- ±3.40282347E+38F 
#### double  	8 bytes
- ±1.79769313486231570E+308d 
#### char 2 byte
- 2 byte
#### boolean 
- true or false

### Casting to another type 
```
int someInt = 25;
byte newByteVal = (byte) (someInt) / 2;
```

### Operator precedance & associativity
- [Link](https://www.hackerearth.com/practice/basic-programming/operators/basics-of-operators/tutorial/)

## Support for special unicode characters
- Java has 2bytes char so supports special characters
- [This](https://unicode-table.com/en/) site lists those characters <br />
Valid statements:
```
char myChar = '\u00A9';
char myChar2 = '©';
String myString = "ফারহান তানভীর উৎস ";
System.out.println(myString);
```

## Collection
### Set
- Contains unique elements
- Duplicates are discarded
#### HashSet
- Doesn't sort
#### TreeSet
- Sorts lexicographically


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

## Some findings
- [ArrayStoreException](https://stackoverflow.com/questions/12369957/dealing-with-an-arraystoreexception)


## Acknowledgement
### Collections: 
- [Cave Of Programming](https://www.youtube.com/playlist?list=PLB841C370FAFB8EC7)
- [ Telusko](https://www.youtube.com/watch?v=JV0atjBcUv4)
- [Inner class Telusko](https://youtu.be/okruEgWGVGU)
- [Lambda expression](https://youtu.be/yb46iD5dJYY)
