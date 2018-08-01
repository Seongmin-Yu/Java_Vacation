package Day2.Test1;

import java.util.Scanner;
/*
 * 달걀 456개를 12개씩 담을 수 있는 상자의 수를 삼항 연산자를 이용하여 실행 결과와 같이 출력되도록 작성하시오.
 * 실행 결과 : 달걀 456개를 12개씩 담을 수 있는 상자의 수는 38개
 */


public class Question9 {
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
