package chapter01;

/**
 * Created by Peng on 2015/11/25.
 */
public class TestMathMethods {
    public static void main(String[] args) {
        //ceil() 向上取整
        System.out.println(Math.ceil(2.5));

        //floor() 向下取整
        System.out.println(Math.floor(2.5));

        /**
         * rint() 返回其值最接近参数并且是整数的 double 值。
         * 如果两个整数的 double 值都同样接近，那么结果取偶数。
         * 特殊情况是：如果参数值是整数，那么结果就是该参数。
         * 如果参数是 NaN 或无穷大或正零或负零，那么结果与参数相同。
         */
        System.out.println(Math.rint(2.5));

        //四舍五入，返回值为 int 。
        System.out.println(Math.round(2.5));
    }
}
