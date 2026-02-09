public class JKad15D {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int temp;
        System.out.println("①まで完成したときの画面 ");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]:" + a[i]);
        }
//        swap 0 and 3
        temp = a[0];
        a[0] = a[3];
        a[3] = temp;
//        swap 1 and 2
        temp = a[1];
        a[1] = a[2];
        a[2] = temp;
        System.out.println("②まで完成したときの画面");
        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "]:" + a[i]);
        }
    }
}
