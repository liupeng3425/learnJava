package chapter03;

/**
 * Created by Peng on 2016/1/22.
 * 使用正则表达式以及一些常用的 String 方法。
 */
public class StringMethodsTest {
    public static void main(String[] args) {

        // "Java.*" 描述的字符串模式是以字符串 Java 开始的，后面紧跟任意0个或多个字符。
        System.out.println("Java is fun matches " + "Java is fun".matches("Java.*"));

        String s = "a+b$#c";
        // 注意 replace() 和 replaceAll() 的区别。replace() 好像不支持正则表达式？
        System.out.println(s.replace("a+b", "xx"));
        System.out.println(s.replace("a", "xy"));
        System.out.println(s.replaceAll("[$#+]", "NNN"));

        // split():limit:最多分成多少个。0代表不限制。
        String[] token = "Java#HTML#Perl".split("#");
        for (String temp : token) {
            System.out.println(temp);
        }
    }
}
