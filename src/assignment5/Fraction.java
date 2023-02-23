package src.assignment5;

// Question 5
public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero");
        }

        int gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd;
        this.denominator = denominator / gcd;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public static Fraction add(Fraction f1, Fraction f2) {
        return f1.add(f2);
    }

    public String to_string() {
        return String.format("%d/%d", this.numerator, this.denominator);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(1, 3);

        Fraction sum1 = f1.add(f2);
        System.out.println(sum1.to_string());

        Fraction sum2 = Fraction.add(f1, f2);
        System.out.println(sum2.to_string());

        Fraction f3 = new Fraction(3, 4);
        Fraction sum3 = f1.add(f2).add(f3);
        System.out.println(sum3.to_string());

    }
}

