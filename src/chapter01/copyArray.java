package chapter01;

import static java.lang.System.arraycopy;

/**
 * Created by Peng on 2015/12/10.
 * using function array copy.
 */
public class CopyArray {
    public static void main(String[] args) {

        ArrayPrinter mArrayPrinter = new ArrayPrinter();

        int[] sourceArray = {1, 3, 2, 4, 5, 6, 2, 65, 7, 43};
        int[] targetArray = new int[sourceArray.length];

        arraycopy(sourceArray, 0, targetArray, 0, 2);

        mArrayPrinter.printArray(targetArray);

    }


}
