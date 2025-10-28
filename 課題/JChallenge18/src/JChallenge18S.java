import java.util.Random;
import java.util.Scanner;

public class JChallenge18S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("生成する整数の桁数を入力してください（1～9）＞");
        int n = sc.nextInt();

        String ans = "";
        while (ans.length() < n) {
            int digit = rand.nextInt(9) + 1;
            ans += digit;
        }

        int attempt = 1;
        while (true) {
            System.out.print(n + "桁の整数を入力してください[" + attempt + "]＞");
            String guess = sc.next();

            if (guess.startsWith("-")) {
                break;
            }

            int score=0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (guess.charAt(i)==ans.charAt(j)){
                        if (i==j){
                            score+=10;
                        }else {
                            score+=1;
                        }
                    }
                }
            }

            boolean isCorrect=true;
            for (int i = 0; i < n; i++) {
                if (guess.charAt(i)!=ans.charAt(i)){
                    isCorrect=false;
                    break;
                }
            }

            if (isCorrect){
                System.out.println(guess+".....正解!");
                break;
            }else {
                System.out.println(guess+".....点数は"+score);
            }
            attempt++;
        }
    }
}
