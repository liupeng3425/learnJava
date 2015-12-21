package chapter01;

import java.util.Arrays;

/**
 * Created by Peng on 2015/12/20.
 * using the class Arrays to sort array.
 */
public class ArraysSort {
    public static void main(String[] args) {
        int data[][] = {{1, 5, 3, 4, 2}, {5, 4, 3, 2, 1}, {12, 32, 4, 2, 34}};
        ArrayPrinter mArrayPrinter = new ArrayPrinter();
        mArrayPrinter.printArray(data[0]);

        // sort(data)：对data所有的数字排序。
        Arrays.sort(data[0]);
        mArrayPrinter.printArray(data[0]);

        // sort(data, 1, 3):Sort part of the array. From data[1] to data[2].
        Arrays.sort(data[1], 1, 4);
        mArrayPrinter.printArray(data[1]);

        // binarySearch(list,xx):二分查找。
        Arrays.sort(data[1]);
        System.out.println("Index of 2 is " + Arrays.binarySearch(data[1], 2) + ".");

        // equals():检测两个数组是否相等。
        System.out.println(Arrays.equals(data[0], data[1]));

        // fill(data, num):填充整个数组。
        Arrays.fill(data[0], 0);
        mArrayPrinter.printArray(data[0]);

        // fill(data, num, fromIndex, toIndex, num):对 data[fromIndex] 到 data[toIndex - 1] 填充 num 。
        Arrays.fill(data[0], 1, 3, 8);
        mArrayPrinter.printArray(data[0]);
    }
}
