# Object
- Instance of class
- Has state & behaviour
- null is internal default state for class (uninitialized class variable set to null by default )


# Constructor
## Overloading constructor
```
public BankAccount() {
    this("123", "Utshaw", "utshaw@example.com", "01800000000", 123);
}

public BankAccount(String accountNumber, String customerName, String email, String phoneNumber, long balance) {
    this.accountNumber = accountNumber;
    this.customerName = customerName;
    this.email = email;
    this.phoneNumber = phoneNumber;
    this.balance = balance;
}
```