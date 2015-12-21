package chapter01;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Peng on 2015/12/20.
 * Sudoku solution.
 */
public class SudokuSolution {
    public static void main(String[] args) {
        int[][] grid = readASudoku();
    }

    public static int[][] readASudoku() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Sudoku puzzle:");

        int[][] grid = new int[9][9];

        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = scanner.nextInt();

        return grid;
    }

    public static boolean isValid(int[][] grid) {
        // 检查行是否包含 1~9.
        for (int[] tmp : grid) {
            if (!is1To9(tmp))
                return false;
        }

        // 检查列是否包含 1~9.
        for (int i = 1; i < 9; i++) {

            int[] column = new int[9];

            for (int j = 0; j < 9; j++) {
                column[j] = grid[j][i];
            }

            if (!is1To9(column))
                return false;

        }

        // 检查块是否包含 1~9.
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                int[] block = new int[9];
                int k = 0;

                for (int row = i * 3; row < i * 3 + 3; row++)
                    for (int column = j * 3; column < j * 3 + 3; column++) {
                        block[k] = grid[row][column];
                        k = k + 1;
                    }

                if (!is1To9(block))
                    return false;

            }
        }

        return true;

    }


    private static boolean is1To9(int[] list) {
        int[] temp = new int[list.length];

        System.arraycopy(list, 0, temp, 0, list.length);
        Arrays.sort(temp);

        for (int i = 0; i < temp.length; i++) {
            if (temp[i] != i + 1)
                return false;
        }
        return true;
    }
}
