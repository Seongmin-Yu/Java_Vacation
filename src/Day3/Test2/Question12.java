package Day3.Test2;

/*
 * 다음 프로그램의 출력 결과는?
 * 정답 : 3
 */

public class Question12 {
    public static void main(String[] args) {
        int a = 3;
        int b = 0;
        switch (a + 2) {
            case 5: b = 1;
            default: b += 2;
        }
        System.out.println(b);
    }
}
