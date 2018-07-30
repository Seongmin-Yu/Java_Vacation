package Day2.TestQuestion;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("달걀의 개수를 입력하세요 : ");
        int agg = scanner.nextInt();
        System.out.print("상자의 크기를 입력하세요 : ");
        int box_size = scanner.nextInt();
        int box = agg % box_size == 0 ? agg / box_size : agg / box_size + 1;

        System.out.println("달걀 " + agg + "개를 "+box_size+"개씩 담으려면 상자는 " + box + "개가 필요합니다.");
    }
}
