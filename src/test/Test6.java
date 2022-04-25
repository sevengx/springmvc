package test;

import java.util.Scanner;

public class Test6 {
    public static void main(String[] args) {
        /*
        100满分：来个王八
        90以上：来个必胜客
        70以上：来个肯德基
        60以上：啥也没有
        50以上：一个嘴巴子
        30以上：三个嘴巴子
        30以下：去死
         */
        Scanner input = new Scanner(System.in);
        System.out.print("请输入你的分数：");
        double score = input.nextDouble();

        if (score == 100)
            System.out.println("来个王八");
        else if (score >= 90)
            System.out.println("来个必胜客");
        else if (score >= 70)
            System.out.println("来个肯德基");
        else if (score >= 60)
            System.out.println("啥也没有");
        else if (score >= 50)
            System.out.println("一个嘴巴子");
        else if (score >= 30)
            System.out.println("三个嘴巴子");
        else if (score < 30)
            System.out.println("去死");


    }
}
