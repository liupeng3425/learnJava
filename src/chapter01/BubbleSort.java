package chapter01;

/**
 * Created by Peng on 2015/11/25.
 * A example of bubble sort.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int i, j;
        int data[] = {1, 5, 3, 4};
        boolean isInOrder;
        for (i = data.length; i > 0; i--) {
            isInOrder = true;
            for (j = 0; j < i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                    isInOrder = false;
                }
            }
            if (isInOrder) {
                break;
            }
        }
        new ArrayPrinter().printArray(data);
    }
}
