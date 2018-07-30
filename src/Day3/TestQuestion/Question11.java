package Day3.TestQuestion;

/*
 * 다음 프로그램의 15줄에 14번을 넣어 실행할때 결과는?
 * 정답 : if 문은 boolean 값을 인자로 받기때문에 구문오류가 발생한다.
 */

public class Question11 {
    public static void main(String[] args) {
        test(10);
    }

    public static void test(int y) {
        int x = 10;
        //   if (x = y) {
        if (x == y) {
            System.out.println("같아");
        } else {
            System.out.println("달라");
        }
    }
}
