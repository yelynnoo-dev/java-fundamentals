import java.util.Random;

public class JKad12S {
    public static void main(String[] args) {
        Random rand = new Random();
        int nobita = 0;
        int gian = 0;
        int suneo = 0;
        int dekisugi = 0;
        System.out.println("ここはECC苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！ ");
        int i = 0;
        while (i < 100) {
            int problem = rand.nextInt(100);
            System.out.print("苦情No." + problem + ":");
            if (problem < 10) {
                System.out.println("のび太が対応します！");
                nobita++;
            } else if (problem % 5 == 0) {
                System.out.println("ジャイアンが対応します！");
                gian++;
            } else if (problem % 3 == 0) {
                System.out.println("スネ夫が対応します！");
                suneo++;
            } else {
                System.out.println("出木杉が対応します！");
                dekisugi++;
            }
            i++;
        }

        System.out.println("のび太は" + nobita + "回対応した！");
        System.out.println("ジャイアンは" + gian + "回対応した！");
        System.out.println("スネ夫は" + suneo + "回対応した！");
        System.out.println("のび太は" + dekisugi + "回対応した！");

        String topStaff = "のび太";
        int topCount = nobita;

        if (gian > topCount) {
            topStaff = "ジャイアン";
            topCount = gian;
        }
        if (suneo > topCount) {
            topStaff = "スネ夫";
            topCount = suneo;
        }
        if (dekisugi > topCount) {
            topStaff = "出木杉";
            topCount = dekisugi;
        }
        System.out.println("一番多く対応したのは" + topStaff + "の" + topCount + "回でした！");
    }
}
