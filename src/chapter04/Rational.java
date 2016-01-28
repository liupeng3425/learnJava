package chapter04;

/**
 * Created by Peng on 2016/1/28.
 * 有理数。
 */
public class Rational extends Number implements Comparable {
    // Date fields for numerator and denominator.
    private long numerator;
    private long denominator;
    private Object o;

    /**
     * 创建一个分子为0，分母为1的有理数。
     */
    public Rational() {
        this(0, 1);
    }

    /**
     * 自定义分子分母的有理数。
     *
     * @param numerator   分子
     * @param denominator 分母
     */
    public Rational(long numerator, long denominator) {
        long gcd = gcd(numerator, denominator);
        this.numerator = numerator / gcd * (denominator < 0 ? -1 : 1);
        this.denominator = Math.abs(denominator) / gcd;
    }

    /**
     * 找分子分母的最大公约数。
     *
     * @param n 分子
     * @param d 分母
     * @return 最大公约数
     */
    private static long gcd(long n, long d) {
        long number1 = Math.abs(n);
        long number2 = Math.abs(d);
        long gcd = 1;
        for (long i = Math.min(number1, number2); i >= 1; i--) {
            if (number1 % i == 0 && number2 % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    /**
     * 返回分子。
     *
     * @return 分子
     */
    public long getNumerator() {
        return numerator;
    }

    /**
     * 返回分母。
     *
     * @return 分母
     */
    public long getDenominator() {
        return denominator;
    }

    /**
     * 加法。
     *
     * @param rational 另一个加数
     * @return 和
     */
    public Rational add(Rational rational) {
        long n = numerator * rational.getDenominator() + denominator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * 减法。
     *
     * @param rational 被减数
     * @return 差
     */
    public Rational subtract(Rational rational) {
        long n = numerator * rational.getDenominator() - denominator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * 乘法。
     *
     * @param rational 因数
     * @return 积
     */
    public Rational multiply(Rational rational) {
        long n = numerator * rational.getNumerator();
        long d = denominator * rational.getDenominator();
        return new Rational(n, d);
    }

    /**
     * 除法。
     *
     * @param rational 除数
     * @return 商
     */
    public Rational divide(Rational rational) {
        long n = numerator * rational.getDenominator();
        long d = denominator * rational.getNumerator();
        return new Rational(n, d);
    }

    /**
     * 重写 toString().
     *
     * @return 有理数的分数形式
     */
    public String toString() {
        if (denominator == 1 || numerator == 0) {
            return numerator + "";
        } else
            return numerator + "/" + denominator;
    }

    /**
     * 重写 equals 方法。
     *
     * @param o 比较对象
     * @return 是否相等
     */
    public boolean equals(Object o) {
        return subtract((Rational) o).getNumerator() == 0;
    }

    @Override
    public int compareTo(Object o) {
        if (subtract((Rational) o).getNumerator() > 0) return 1;
        else if (subtract((Rational) o).getNumerator() == 0) return 0;
        else return -1;
    }

    @Override
    public int intValue() {
        return (int) doubleValue();
    }

    @Override
    public long longValue() {
        return (long) doubleValue();
    }

    @Override
    public float floatValue() {
        return (float) doubleValue();
    }

    @Override
    public double doubleValue() {
        return numerator * 1.0 / denominator;
    }
}
