/*
課題名:JKad27C
作成日:2025/7/24
作成者:YE LYNN OO
*/
public class JKad27C {
    public static void main(String[] args) {
        int array[] = new int[20];
        JKad27D.initArray(array);
        JKad27D.showArray(array);
        bubbleSort(array);
        JKad27D.showArray(array);
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }

            }
            JKad27D.showArray(array);

        }
    }
}
