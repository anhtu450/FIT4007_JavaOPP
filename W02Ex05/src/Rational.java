public class Rational {
    private int numerator;   // Numerator
    private int denominator; // Denominator

    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();  // Reduce fraction upon initialization
    }

    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? Math.abs(a) : gcd(b, a % b);
    }

    public Rational reciprocal() {
        return new Rational(denominator, numerator);
    }

    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    public Rational multiply(Rational other) {
        return new Rational(this.numerator * other.numerator, this.denominator * other.denominator);
    }

    public Rational divide(Rational other) {
        if (other.numerator == 0) {
            throw new IllegalArgumentException("Cannot divide by a fraction with a numerator of zero");
        }
        return new Rational(this.numerator * other.denominator, this.denominator * other.numerator);
    }

    public boolean equals(Rational other) {
        double thisValue = (double) this.numerator / this.denominator;
        double otherValue = (double) other.numerator / other.denominator;
        return Math.abs(thisValue - otherValue) < 0.0001;
    }

    @Override
    public String toString() {
        return String.format("%d/%d", numerator, denominator);
    }
}
