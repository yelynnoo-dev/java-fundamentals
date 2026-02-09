/*
課題名:JKad16A1
作成日:2025/6/17
作成者:YE LYNN OO
*/

public class JKad16A2 {
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
        int temp;
        for (int i = 0; i < cards.length / 2; i++) {
            temp = cards[i];
            cards[i] = cards[cards.length - 1 - i];
            cards[cards.length - 1 - i] = temp;
        }
        for (int i = 0; i < cards.length; i++) {
            System.out.println("cards[" + i + "]：" + cards[i]);
        }
    }
}
