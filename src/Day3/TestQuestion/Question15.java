package Day3.TestQuestion;

/*
 * 다음과 같은 조건으로 성적처리 프로그램을 작성하시오.
 * 조건 : 1. 중간고사, 기말고사, 레포트, 출석점수를 입력받아 계산한다.
 *        2. 성적은 소수 이하 2자리까지 출력
 *           - (중간+기말)/2 -> 60%
 *           - 레포트 -> 20%
 *           - 출석 -> 20%
 *        3. 학점의 기준(if~else if문 이용)
 *           - 90 이상 'A'
 *           - 80 이상 'B'
 *           - 70 이상 'C'
 *           - 60 이상 'D'
 *           - 나머지 'F'
 *        4. 평가기준(switch 문 이용)
 *           - A, B 학점 -> "EXCELLENT"
 *           - C, D 학점 -> "GOOD"
 *           - F 학점 - > "POOR"
 * 실행 결과 : 점수를 입력하세요 (중간고사, 기말고사, 레포트, 출석점수) : 100 90 100 100
 *            중간고사 : 100
 *            기말고사 : 90
 *            과제점수 : 100
 *            출석점수 : 100
 *
 *            성적 : 97.00
 *            학점 : A
 *            평가 : EXCELLENT
 */

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
            case 'B': comment = "EXCELLENT"; break;
            case 'C':
            case 'D': comment = "GOOD"; break;
            default : comment = "POOR";
        }
        System.out.printf("성적 : %.2f\n", avg);
        System.out.println("학점 : " + score);
        System.out.println("평가 : " + comment);
    }
}
