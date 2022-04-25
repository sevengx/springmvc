package test;


import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入高翥的考试分数：");
        int score = input.nextInt();

        if (score >= 60) {
            System.out.println("吃KFC");
            System.out.println("买双鞋");
        } else {
            System.out.println("男女混合双打");
            System.out.println("跪键盘");
        }
    }
}
