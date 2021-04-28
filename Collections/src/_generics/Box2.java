package _generics;

public class Box2<T extends Number> {
    private T type;

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
