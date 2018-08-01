package Day4.Test3;

/*
 * 두 개의 일차원 배열 a, b의 인자 크로스하여 합 구하기
 */

public class Question6 {
    public static void main(String[] args) {
        int[] a = {2, 4, 6, 8, 10, 12, 14, 16};
        int[] b = {1, 1, 2, 3, 5, 8, 13, 21};

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + b[7 - i] + " ");
        }
    }
}
