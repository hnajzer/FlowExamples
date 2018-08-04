public class Calculator {
    public double divide (int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("y cannot be 0!");
        }
        return x / y;
    }
}
