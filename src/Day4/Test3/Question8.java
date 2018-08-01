package Day4.Test3;

/*
 * 일차원 배열에 대입된 점수에 해당하는 막대 그래프를 다음과 같이 출력하시오
 * 실행 결과 :  90점 : ■ ■ ■ ■ ■ ■ ■ ■ ■
 *             80점 : ■ ■ ■ ■ ■ ■ ■ ■
 *             50점 : ■ ■ ■ ■ ■
 *             70점 : ■ ■ ■ ■ ■ ■ ■
 *             65점 : ■ ■ ■ ■ ■ ■
 *             90점 : ■ ■ ■ ■ ■ ■ ■ ■ ■
 *            100점 : ■ ■ ■ ■ ■ ■ ■ ■ ■ ■
 *             43점 : ■ ■ ■ ■
 *             55점 : ■ ■ ■ ■ ■
 *             87점 : ■ ■ ■ ■ ■ ■ ■ ■
 */

public class Question8 {
    public static void main(String[] args) {
        int[] arr = {90, 80, 50, 70, 65, 90, 100, 43, 55, 87};

        for (int score : arr) {
            System.out.printf("%3d점 : ", score);
            for (int j = 0; j < score / 10; j++)
                System.out.print("■ ");
            System.out.println();
        }
    }
}
