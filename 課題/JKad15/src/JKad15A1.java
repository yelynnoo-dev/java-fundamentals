public class JKad15A1 {
    public static void main(String[] args) {
        int[] scores = {30, 50, 100, 70, 95};
        int max = 0;
        System.out.println("最高得点を探します！");
        for (int i = 1; i < scores.length; i++) {
            if (scores[max] < scores[i]) {
                max = i;
            }
        }
        System.out.println("最高得点は" + scores[max] + "点です！");
    }
}
