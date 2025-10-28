/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

public class JKad17B2 {
    public static void main(String[] args) {
        String[] suit = {"♠", "♥", "♦", "♣"};
        String[] num = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

        for (int i = 0; i < 52; i++) {
            System.out.print(suit[i / 13] + num[i % 13] + "\t");
            if (i % 13 == 12) {
                System.out.println();
            }
        }
    }
}
