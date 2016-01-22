package chapter03;

/**
 * Created by Peng on 2016/1/22.
 * 测试 StringBuilder。
 */
public class StringBuilderTest {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello world!");
        System.out.println(stringBuilder.length());
        stringBuilder.append("XXX");
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());
        stringBuilder.setLength(10);
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);

        stringBuilder.trimToSize();
        System.out.println(stringBuilder.length());
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder);
    }
}
