public class JKad15C {
    public static void main(String[] args) {
        int[] cards = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("カードが" + cards.length + "枚あります！ ");
        System.out.println("カードを順番に表示します！");
        for (int i = 0; i < cards.length; i++) {
            System.out.println("cards[" + i + "]:" + cards[i]);
        }
    }
}
