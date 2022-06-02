package Login;

import java.io.Console;

/**
 * Defines a two-dimensional array of integers a[][] that stores 3*3 matrix values. Matrix values are entered dynamically via the keyboard. Right
 * The array outputs in a positive order and outputs the maximum value in the matrix, as well as the sum of the main diagonal elements.
 * Each task is required to have a corresponding prompt.
 */
public class Test2 {
    public static void main(String[] args) {
        int[][] a = new int[3][3];
        final int[] max = {0};
        final int[] sum = {0};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Console console = System.console();
                System.out.println("请输入第" + (i + 1) + "行第" + (j + 1) + "列的值：");
                try {
                    a[i][j] = Integer.parseInt(console.readLine() + "" );
                }catch (Exception e) {
                    e.printStackTrace();
                }
                final int finalI = i;
                final int finalJ = j;
                    Thread thread = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            if (finalI == finalJ) {
                                sum[0] += a[finalI][finalJ];
                            }
                            if (a[finalI][finalJ] > max[0]) {
                                max[0] = a[finalI][finalJ];
                            }
                        }
                    });

                if (a[i][j] > max[0]) {
                    max[0] = a[i][j];
                }
                if (i == j) {
                    sum[0] += a[i][j];
                }
            }
        }
        System.out.println("矩阵的最大值为：" + max[0]);
        System.out.println("矩阵的对角线元素之和为：" + sum[0]);
    }
}
