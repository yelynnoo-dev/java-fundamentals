/*
�ۑ薼:JChallenge10X2
�쐬��:2025/05/22
�쐬��:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge10X2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("�扽���܂ŕ����܂����H��");
        int n = sc.nextInt();
        long first = 1, second = 1;
        System.out.print(first + "\t" + second + "\t");
        for (int i = 3; i <= n; i++) {
            long next = first + second;
            System.out.print(next + "\t");
            if (i % 10 == 0) System.out.println();
            first = second;
            second = next;
        }
        sc.close();
    }
}