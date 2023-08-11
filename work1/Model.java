
public class Model {
    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) throws IllegalArgumentException {
        if (num2 == 0) {
            throw new IllegalArgumentException("На 0 делить нельзя");
        }
        return num1 / num2;
    }
}
