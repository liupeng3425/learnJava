package chapter01;

/**
 * Created by Peng on 2015/11/27.
 * Grammar of declare a array.
 */
public class ArrayDeclaration {
    public static void main(String[] args) {
        //ctrl + shift + U 将选中的字符切换大/小写
        final int NUMBER_OF_ELEMENTS = 20;

        //声明数组变量 elementType[] arrayRefVar;(元素类型[] 数组引用变量;)
        //创建数组 arrayRefVar = new elementType[arraySize];
        //默认值 数值型为 0 ，char 为 '\u0000'，boolean 为 false;
        //数组初始化语法 elementType[] arrayRefVar = {value0, value1, value2, ...,}
        double[] numbers = new double[NUMBER_OF_ELEMENTS];


        double sum = 0;

        for (int i = 0;i<numbers.length;i++) {
            numbers[i] = i;
        }

        //for-each 循环
        for (double tmp : numbers) {
            sum = sum + tmp;
        }

        System.out.println(sum);

    }
}
