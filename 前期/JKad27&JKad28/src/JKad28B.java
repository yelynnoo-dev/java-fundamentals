/*
課題名:JKad28B
作成日:2025/7/24
作成者:YE LYNN OO
*/
public class JKad28B {
    public static void main(String[] args) {
        int[] array = new int[20];
        JKad27D.initArray(array);
        JKad27D.showArray(array);
        selectionSort(array);
        JKad27D.showArray(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
    }
}
