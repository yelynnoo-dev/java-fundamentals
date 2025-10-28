/*
課題名:JKad25D
作成日:2025/7/17
作成者:YE LYNN OO
*/

public class JKad25D {
    public static void main(String[] args) {
        char a = 'A';
        char b = 'B';
        char c = 'C';

        System.out.println(a + "\t" + b + "\t" + c);
        System.out.println(((int) a) + "\t" + ((int) b) + "\t" + ((int) c));

        a++;
        b++;
        c++;

        System.out.println("インクリメントして表示します！");
        System.out.println(a + "\t" + b + "\t" + c);
        System.out.println(((int) a) + "\t" + ((int) b) + "\t" + ((int) c));
    }
}
