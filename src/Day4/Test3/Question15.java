package Day4.Test3;

public class Question15 {
    public static void main(String[] args) {
        int[][] A = {{5, 7, 10, 4}, {2, 5, 3, 6}};
        /* 5 7 10 4 *
         * 2 5  3 6 */
        int[][] B = {{4, 1, 1}, {-6, 7, 5}, {9, 9, 4}, {2, 5, 5}};
        /* 4 1 1 *
         *-6 7 5 *
         * 9 9 4 *
         * 2 5 5 */
        int[][] RES = new int[2][3];

        for (int i = 0; i < A.length; i++) {
            for (int d = 0; d < 3; d++) {
                for (int j = 0; j < A[i].length; j++) {
                    RES[i][d] += A[i][j] * B[j][d];
                }
                System.out.printf("%5d", RES[i][d]);
            }
            System.out.println();
        }
    }
}
