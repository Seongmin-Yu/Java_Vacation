package Day3.TestQuestion;

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
