# Troubleshooting
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