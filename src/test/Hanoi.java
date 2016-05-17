package test;

/**
 * Created by Peng on 2016/5/17.
 * Hanoi
 */
public class Hanoi {
    private static int hanoi(int n, String colA, String colB, String colC) {
        if (n > 0) {
            hanoi(n - 1, colA, colC, colB);
            System.out.println(colA + "-->" + colC);
            hanoi(n - 1, colB, colA, colC);
        }
        return 0;
    }

    public static void main(String[] args) {
        hanoi(5, "A", "B", "C");
    }
}
