# Troubleshooting
## Import statement
```
import java.util.Scanner;
```
## Reading 'enter' issue
The below code gets empty string as `name` because of pressing enter after taking `yearOfBirth`  as input
```
int yearOfBirth = scanner.nextInt();
String name = scanner.nextLine();
```
Solution:
```
int yearOfBirth = scanner.nextInt();
scanner.nextLine();
String name = scanner.nextLine();
```

## Check valid input 
```
Scanner scanner = new Scanner(System.in);
System.out.println("Enter an integer");
if(scanner.hasNextInt()) {
    System.out.println(scanner.nextInt());
}else{
    System.out.println("Invalid input");
}
scanner.close();
```