package Day1;

import java.util.Scanner;

public class Test3_Question5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = null;
        String country = null;
        int age = 0;
        float height = 0;

        System.out.print("국적 이름 나이 키 입력 : ");
        country = scanner.next();
        name = scanner.next();
        age = scanner.nextInt();
        height = scanner.nextFloat();

        System.out.println("나의 국적은 "+country+"이며 이름은 "+name+"입니다");
        System.out.println("나이는 "+age+"살이며 키는 "+height+"cm입니다");
    }
}
