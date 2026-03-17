package edu.sdsu.cs160l.calculator;

public class IntegerCalculator implements Calculator<Integer> {
    public Integer add(Integer a, Integer b) {
        return a + b;
    }

    public Integer sub(Integer a, Integer b) {
        return a - b;
    }

    public Integer div(Integer a, Integer b) {
        if (b == 0) throw new ArithmeticException();
        return a / b;
    }

    public Integer mul(Integer a, Integer b) {
        return a * b;
    }
}
