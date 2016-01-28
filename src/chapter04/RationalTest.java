package chapter04;

/**
 * Created by Peng on 2016/1/28.
 * using class Rational.
 */
public class RationalTest {
    public static void main(String[] args) {
        Rational rational = new Rational(1, 0);
        Rational rational1 = new Rational(1, 2);
        Rational rational2 = new Rational(2, 4);
        System.out.println(rational.toString());
        System.out.println(rational1.toString());
        System.out.println(rational2.toString());
        System.out.println(rational.doubleValue());
        System.out.println(rational1 + " + " + rational2 + " = " + rational1.add(rational2));
        System.out.println(rational1 + " - " + rational2 + " = " + rational1.subtract(rational2));
        System.out.println(rational1 + " * " + rational2 + " = " + rational1.multiply(rational2));
        System.out.println(rational1 + " / " + rational2 + " = " + rational1.divide(rational2));
    }
}
