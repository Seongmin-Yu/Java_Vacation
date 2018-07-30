package Day2.TestQuestion;

/*
 * 정수형 정수 27890의 오른쪽에서 8번째 비트와 9번째 비트가 각각 어떻게 되는지 실행결과와 같이 연산자를 이용하여 작성하시오
 * 실행 결과 : 오른쪽에서 8번째 비트 : 1
 *           오른쪽에서 9번째 비트 : 0
 */

public class Question8 {
    public static void main(String[] args) {
        int a = 27890 >> 7;
//        int b = 1;    //0x0001

        System.out.println("오른쪽에서 8번째 비트 : " + (a & 1));
        System.out.println("오른쪽에서 9번째 비트 : " + (a & 2));
    }
}
