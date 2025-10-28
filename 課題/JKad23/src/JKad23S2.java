/*
課題名:JKad23S2
作成日:2025/7/10
作成者:YE LYNN OO
*/
public class JKad23S2 {
    public static void main(String[] args) {
        System.out.println("素数を表示します！");
        findPrimes();
    }

    public static void findPrimes() {
        int n = 100;
        boolean[] isPrime = new boolean[n + 1];
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        int loopCount = 0;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                    loopCount++;
                }
            }
        }

        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println("\nループした回数は" + loopCount + "回です！");
    }
}