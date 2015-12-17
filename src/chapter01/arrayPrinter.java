package chapter01;

/**
 * Created by Peng on 2015/12/10.
 */
public class arrayPrinter {
    public void printArray(int[] array) {
        for (int tmp : array) {
            System.out.print(tmp + "\t");
        }
    }

    public void printArray(char[] array) {
        for (char tmp : array) {
            System.out.print(tmp + "\t");
        }
    }

    public void printArray(double[] array) {
        for (double tmp : array) {
            System.out.print(tmp + "\t");
        }
    }

    public void printArray(float[] array) {
        for (float tmp : array) {
            System.out.print(tmp + "\t");
        }
    }
}
