package chapter01;

/**
 * Created by Peng on 2015/12/17.
 * 可以把类型相同但个数可变的参数传递给方法。
 */
public class VarAragsDemo {
    public static void main(String[] args) {
        System.out.println(sum(1, 2, 3, 4, 5));
    }

    public static int sum(int... numbers) {
        int sum = 0;
        for (int tmp : numbers) {
            sum = sum + tmp;
        }
        return sum;
    }
}
