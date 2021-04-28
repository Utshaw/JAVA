# .hashCode()
- Main focus is to generate same hashcode for equal objects, different hashcode for different objects
- good hashcode results in less collission
- never use random inside hashCode function, it will cause problem
- Objects.hash works fine in 95% cases, you can also create your own hashing algorithm
```
@Override
public int hashCode() {
    return Objects.hash(name, pizzaSize, price);
}
```