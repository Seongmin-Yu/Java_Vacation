package Day2.TestQuestion;

public class Question1 {
    public static void main(String[] args) {
        int money = 65430;
        for(int i = 10000;i>9;){
            System.out.println(i+"원 : "+money/i);
            money %= i;
            i/=10;
        }
    }
}
