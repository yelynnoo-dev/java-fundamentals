/*
課題名:JKad22X
作成日:2025/7/8
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad22X {
    public static Scanner sc=new Scanner(System.in);
    public static  String[] history;

    public static void main(String[] args) {
        System.out.println("あなたは勇者です！");
        System.out.println("がんばって城までたどり着いてください！！");
        gotoTown(0);
    }
    public static void gotoTown(int move){
        history[move]="["+move+"]町";
        System.out.println("["+move+"]あなたは町にいます。");
        System.out.print("どちらへ進みますか？（1：草原、それ以外：森）＞");
        int choice= sc.nextInt();
        if (choice==1){
            gotoGrassland(move+1);
        }else {
            gotoForest(move+1);
        }
    }
    public static void gotoGrassland(int move){
        history[move]="["+move+"]町";
        System.out.println("["+move+"]あなたは町にいます。");
        System.out.print("どちらへ進みますか？（1：草原、それ以外：森）＞");
        int choice= sc.nextInt();
        if (choice==1){
            gotoTown(move+1);
        }else {
            gotoForest(move+1);
        }
    }
    public static void gotoForest(int move){
        history[move]="["+move+"]町";
        System.out.println("["+move+"]あなたは町にいます。");
        System.out.print("どちらへ進みますか？（1：草原、それ以外：森）＞");
        int choice= sc.nextInt();
        if (choice==1){
            gotoGrassland(move+1);
        }else {
            gotoForest(move+1);
        }
    }
}
