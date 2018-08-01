package Day4.Test3;

/*
 * 정수 1~10까지의 난수를 9개를 대입 받은 일차원 배열을 정렬한 후 총합을 마지막 요소에 대입한 후 출력하는 코드를 구현해라.
 */

public class Question7 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int sum = 0;
        int temp = 0;

        System.out.println("[정렬 전]");

        for (int i = 0; i < num.length - 1; i++) {
            num[i] = (int) (Math.random() * 10) + 1;
            System.out.printf("%d  ", num[i]);
            sum += num[i];
        }
        num[9] = sum;

        for (int i = 0; i < num.length - 2; i++) {
            for (int j = 0; j < num.length - 2; j++) {
                if (num[j] > num[j + 1]) {
                    temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }

        System.out.println("\n[정렬 후]");
        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d", num[i]);
            if (i == 9) {
                break;
            } else if (i == 8) {
                System.out.print(" = ");
            } else {
                System.out.print(" + ");
            }

        }
    }
}
