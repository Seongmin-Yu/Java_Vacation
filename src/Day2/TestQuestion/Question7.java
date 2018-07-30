package Day2.TestQuestion;
/*
 * 경비 65430원을 변수에 대입한 다음 산술연산자를 이용하여 실행 결과와 같이 출력되도록 코드를 작성하시오.
 * 실행 결과 : 만원 : 6
 *            천원 : 5
 *            백원 : 4
 *            심원 : 3
 */
public class Question7 {
    public static void main(String[] args) {
        int money = 65430;
        for(int i = 10000;i>9;){
            System.out.println(i+"원 : "+money/i);
            money %= i;
            i/=10;
        }
    }
}
