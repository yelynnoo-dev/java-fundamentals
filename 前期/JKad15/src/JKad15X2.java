import java.util.Random;

public class JKad15X2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int temp, randCards;

        System.out.println("カードを並べ替えます！");
        for (int i = cards.length-1; i > 0; i--) {
            randCards = rand.nextInt(cards.length);
            temp = cards[i];
            cards[i] = cards[randCards];
            cards[randCards] = temp;
        }

        for (int i = 0; i < cards.length; i++) {
            System.out.println("cards[" + i + "]:" + cards[i]);
        }
    }
}
