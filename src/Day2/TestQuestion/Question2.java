package Day2.TestQuestion;

public class Question2 {
    public static void main(String[] args) {
        int a = 27890 >> 7;
//        int b = 1;    //0x0001

        System.out.println("오른쪽에서 8번째 비트 : " + (a & 1));
        System.out.println("오른쪽에서 9번째 비트 : " + (a & 2));
    }
}
