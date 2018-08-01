package Day4.Test3;

import java.util.Scanner;

public class Question13 {
    public static void main(String[] args) {
        int[][] answer = {{1, 3, 2, 4, 3, 1, 4, 2, 2, 1}, {3, 2, 4, 2, 2, 1, 1, 3, 4, 1}, {2, 4, 3, 2, 1, 2, 1, 3, 3, 4},
                {2, 3, 3, 1, 1, 3, 2, 2, 4, 4}, {3, 1, 1, 2, 4, 1, 2, 3, 1, 3}};
        int[] jd = new int[10];
        int[] count = {0, 0, 0, 0, 0};
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < jd.length; i++) {
            jd[i] = s.nextInt();
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (answer[i][j] == jd[j]) {
                    count[i]++;
                }
            }
        }
        for (int i = 0; i < count.length; i++) {
            System.out.print("학생 "+i+" :");
            for (int j = 0; j < answer[i].length; j++){
                System.out.printf("%2d",answer[i][j]);
            }
                System.out.println("         학생 " + (i + 1) + "의 점수 : " + count[i] + "점");
        }
    }
}
