package _generics;

public class MyClass<T>{
    T ob;

    public MyClass(T ob) {
        this.ob = ob;
    }

    public T getOb() {
        return ob;
    }

    public void setOb(T ob) {
        this.ob = ob;
    }

    public void showClass() {
        System.out.println(ob.getClass().getSimpleName());
    }


}
