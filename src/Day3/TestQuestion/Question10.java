package Day3.TestQuestion;

public class Question10 {
    public static void main(String[] args) {
        for (int a = 0; a < 20; a++) {
            double i = Math.random();
            int value = (int) (i * 6) + 1;
            System.out.println(value + "번이 나왔습니다.");
        }
    }
}
