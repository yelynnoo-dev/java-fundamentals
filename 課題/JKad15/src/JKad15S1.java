public class JKad15S1 {
    public static void main(String[] args) {
        int[] heights = {165, 170, 160, 175, 155};
        int temp;

        System.out.println("一番背の高い人を最後尾へ！");
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] > heights[i + 1]) {
                temp = heights[i];
                heights[i] = heights[i + 1];
                heights[i + 1] = temp;
            }
        }
        for (int i = 0; i < heights.length; i++) {
            System.out.println("heights[" + i + "]:" + heights[i]);
        }
    }
}
