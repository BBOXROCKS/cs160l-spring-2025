public class DoubleCalculator implements Calculator<Double> {
    public Double add(Double a, Double b) {
        return a + b;
    }

    public Double sub(Double a, Double b) {
        return a - b;
    }

    public Double div(Double a, Double b) {
        if (b == 0) return Double.POSITIVE_INFINITY;
        return a / b;
    }

    public Double mul(Double a, Double b) {
        return a * b;
    }
}
