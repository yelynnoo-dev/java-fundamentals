import java.util.Random;

/*
課題名:JKad27D
作成日:2025/7/24
作成者:YE LYNN OO
*/
public class JKad27D {
    public static void main(String[] args) {
        int array[] = new int[20];
        initArray(array);

        System.out.println("10 個まで表示します！");
        showArray(array, 10);

        System.out.println("すべて表示します！");
        showArray(array);
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    public static void showArray(int[] array, int length) {
        for (int i = 0; i < array.length; i++) {
            if (i < length) {
                System.out.print(array[i] + "\t");
            } else {
                System.out.print("--\t");
            }
        }
        System.out.println();
    }

    public static void initArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }
}
