public class JKad15X1 {
    public static void main(String[] args) {
        int[] heights = {165, 170, 160, 175, 155};
        int temp;
        for (int i = 0; i < heights.length - 1; i++) {
            for (int j = 0; j < heights.length - 1 - i; j++) {
                if (heights[j] > heights[j + 1]) {
                    temp = heights[j];
                    heights[j] = heights[j + 1];
                    heights[j] = temp;
                }
            }
        }
        for (int i = 0; i < heights.length; i++) {
            System.out.println("heights[" + i + "]:" + heights[i]);
        }
    }
}
