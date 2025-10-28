/*
課題名:JKad27D
作成日:2025/8/5
作成者:YE LYNN OO
*/

import java.util.Arrays;

public class JKad27X {
    public static void main(String[] args) {

        int[] array = {92, 10, 17, 5, 23, 77, 74, 36, 26, 82, 28, 26, 80, 41, 2, 35, 83, 45, 73, 28};
        System.out.println("並び替え前の配列:");

        showArray(array);
        mergeSort(array);

        System.out.println("\n\n並び替え後の配列:");
        showArray(array);
    }


    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int mid = array.length / 2;
        int[] leftArray = Arrays.copyOfRange(array, 0, mid);
        int[] rightArray = Arrays.copyOfRange(array, mid, array.length);

        mergeSort(leftArray);
        mergeSort(rightArray);

        int left = 0;
        int right = 0;
        int merge = 0;

        while (left < leftArray.length && right < rightArray.length) {
            if (leftArray[left] <= rightArray[right]) {
                array[merge] = leftArray[left];
                left++;
                merge++;
            } else {
                array[merge] = rightArray[right];
                right++;
                merge++;
            }
        }
        while (left < leftArray.length) {
            array[merge] = leftArray[left];
            left++;
            merge++;
        }
        while (right < rightArray.length) {
            array[merge] = rightArray[right];
            right++;
            merge++;
        }
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
