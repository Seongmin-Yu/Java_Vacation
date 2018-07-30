package Day3.TestQuestion;

import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요 (중간고사, 기말고사, 레포트, 출석점수) : ");
        char score = ' ';
        String comment = null;
        int mid = scanner.nextInt();
        int last = scanner.nextInt();
        int task = scanner.nextInt();
        int call = scanner.nextInt();
        System.out.println("중간고사 : " + mid + "\n기말고사 : " + last + "\n과제점수 : " + task + "\n출석점수 : " + call + "\n");

        double avg = ((double) (mid + last) / 2 * 0.6) + ((double) task * 0.2) + ((double) call * 0.2);
        if (avg >= 90) {
            score = 'A';
        } else if (avg >= 80) {
            score = 'B';
        } else if (avg >= 70) {
            score = 'C';
        } else if (avg >= 60) {
            score = 'D';
        } else {
            score = 'F';
        }
        switch (score) {
            case 'A':
            case 'B':
                comment = "EXCELLENT";
                break;
            case 'C':
            case 'D':
                comment = "GOOD";
                break;
            default:
                comment = "POOR";
        }
        System.out.printf("성적 : %.2f\n", avg);
        System.out.println("학점 : " + score);
        System.out.println("평가 : " + comment);
    }
}
