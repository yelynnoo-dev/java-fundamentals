/*
課題名:JKad23A2
作成日:2025/7/10
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad23S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean[] isPrime = new boolean[101];
        initPrime(isPrime);

        int input;
        do {
            System.out.println("現在、残っている数");
            printPrime(isPrime);
            System.out.print("\n何の倍数を省きますか？");
            input = sc.nextInt();

            if (input < 0) {
                System.out.println("素数は以下の通りです！");
                printPrime(isPrime);
            } else {
                for (int i = input * 2; i < isPrime.length; i += input) {
                    isPrime[i] = false;
                }
            }
        } while (input > 0);
    }

    public static void printPrime(boolean[] isPrime) {
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i] == true) {
                System.out.print(i + " ");
            }
        }
    }

    public static void initPrime(boolean[] isPrime) {
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
    }
}
