/*
課題名:JKad26S2
作成日:2025/7/22
作成者:YE LYNN OO
*/

public class JKad26S2 {
    final static int FIZZ = 0b0001;
    final static int BUZZ = 0b0010;

    public static void main(String[] args) {
        for (int i = 1; i <= 40; i++) {
            int result=isFizz(i);
            switch (result){
                case FIZZ -> System.out.println("わん！");
                default -> System.out.println(i);
            }
        }
    }

    public static int isFizz(int i) {
        if ((i % 3) == 0) {
            return FIZZ;
        } else {
            return 0;
        }
    }
}
