package Day3.TestQuestion;

/*
 * 50개의 난수를 만들어 while 문과 if 문을 사용해서 다음과 같이 출력하시오.
 * 조건 : 1 ~ 100 사이의 수만 출력 되게 한다.
 *       1줄에 6개씩 표시한다.
 *
 * 실행 결과 :    26    2   65   65    2   80
 *               74   13   43   47   41   69
 *               69   32    3   61   14   75
 *               66   65   73   61   66   51
 *               38   99   64   41   26   26
 *               45   98   47   29   64   73
 *               34    5   25   60   70    9
 *               57   19   94   41   53   27
 *               96   96
 *            합계 : 2499
 */

public class Question14 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        int i = 0;
        while (i < 50) {
            if (count < 6) {
                int value = (int) (Math.random() * 100) + 1;
                sum += value;
                System.out.printf("%5d", value);
                count++;
                i++;
            } else {
                System.out.println(" ");
                count = 0;
            }
        }
        System.out.println("\n합계 : " + sum);
    }
}
