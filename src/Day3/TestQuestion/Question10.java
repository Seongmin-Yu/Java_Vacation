package Day3.TestQuestion;
/*
 * if/else문장을 사용하여 주사위의 번호를 뽑는 프로그램을 작성하시오.
 * 조건 : Math.random()메소드를 활용 : 이 메소드는 0.0과 1.0사이에 속하는 double 타입의 난수 값을 리턴한다.
 * 실행 결과 : ex) 3번이 나왔습니다.
 */


public class Question10 {
    public static void main(String[] args) {
        for (int a = 0; a < 20; a++) {
            double i = Math.random();
            int value = (int) (i * 6) + 1;
            System.out.println(value + "번이 나왔습니다.");
        }
    }
}
