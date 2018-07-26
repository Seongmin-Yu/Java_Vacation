package Day1.Error;

import java.util.Scanner;

public class Test4_Question8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int korean = scanner.nextInt();
        int english = scanner.nextInt();
        int math = scanner.nextInt();
        int total = korean + english + math;
        float avg = total / 3;


        System.out.println("이름 : " + name);
        System.out.println("국어 : "+korean+"            영어 : "+english+"            수학 : "+math);
        System.out.println("총점 : "+total+"  평균 : "+avg);
    }
}
