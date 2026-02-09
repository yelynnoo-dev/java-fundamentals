public class note {
    public static void main(String[] args) {

        int[][] scores = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14}};
//        an array which has [3] row [5] column

//        scores.length only take the row lengthn in this case its 3
        for (int i = 0; i < scores.length; i++) {
//            if we write scores.length it will print only upto 3
//            if we want to print upto 5 we need to set the lenght manually
//            scores[i].length will allocate each array length
//            this will work  even the array sizes are not equal because it allocate each loop manually
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j]);
            }
            System.out.println();
        }
    }
}
