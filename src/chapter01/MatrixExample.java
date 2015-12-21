package chapter01;

/**
 * Created by Peng on 2015/12/20.
 * Examples of declare matrix.
 */
public class MatrixExample {
    public static void main(String[] args) {
        int data[][] = {
                {1, 2, 3, 4, 5},
                {1, 2, 3, 4},
                {1, 2, 3},
                {1, 2},
                {1}
        };

        ArrayPrinter mArrayPrinter = new ArrayPrinter();

        for (int[] tmp : data) {
            mArrayPrinter.printArray(tmp);
        }
    }
}
