public class Main {
    public static void main(String[] args) {
        Rational r1 = new Rational(1, 2);  // 1/2
        Rational r2 = new Rational(3, 4);  // 3/4

        System.out.println("Fraction 1: " + r1);
        System.out.println("Fraction 2: " + r2);

        System.out.println("Reciprocal of fraction 1: " + r1.reciprocal());
        System.out.println("Reciprocal of fraction 2: " + r2.reciprocal());

        System.out.println("Addition of two fractions: " + r1.add(r2));
        System.out.println("Subtraction of two fractions: " + r1.subtract(r2));
        System.out.println("Multiplication of two fractions: " + r1.multiply(r2));
        System.out.println("Division of two fractions: " + r1.divide(r2));

        System.out.println("Comparison of two fractions: " + r1.equals(r2));
    }
}