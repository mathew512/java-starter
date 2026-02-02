package io.github.mathew512.generics;

public class NumberBox<T extends Number> {
    private T number;

    public NumberBox(T number) {
        this.number = number;
    }

    public double getSquare() {
        return number.doubleValue() * number.doubleValue();
    }
    
}
