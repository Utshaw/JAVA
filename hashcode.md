# .hashCode()
- returns object's memory address
- good hashcode results in less collission
- never use random inside hashCode function, it will cause problem
```
@Override
public int hashCode() {
    return Objects.hash(name, pizzaSize, price);
}
```