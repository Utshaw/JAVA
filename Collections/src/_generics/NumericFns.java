package _generics;

public class NumericFns<T extends Number>{
    T num;

    public NumericFns(T num) {
        this.num = num;
    }

    double square() {
        return num.intValue() * num.doubleValue();
    }

    boolean absEqual(NumericFns<?> ob2) {
        return Math.abs(this.num.doubleValue()) == Math.abs(ob2.num.doubleValue());


    }
}
