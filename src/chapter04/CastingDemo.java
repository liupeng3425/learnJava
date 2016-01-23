package chapter04;

/**
 * Created by Peng on 2016/1/23.
 * 用 instanceof 运算符。
 */
public class CastingDemo {
    public static void main(String[] args) {
        Object object1 = new Circle(23);
        Object object2 = new Rectangle(2, 5);

        displayObject(object1);
        displayObject(object2);
    }

    public static void displayObject(Object object) {
        if (object instanceof Circle) {
            System.out.println("The circle is " + object.toString());
        } else if (object instanceof Rectangle) {
            System.out.println("The rectangle is " +
                    ((Rectangle) object).getHeight() + " high and " +
                    ((Rectangle) object).getWidth() + " wide.");
        }
    }
}
