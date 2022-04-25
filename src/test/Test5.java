package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //用户输入
        Scanner input = new Scanner(System.in);
        int a, b, c, score = 0;
        System.out.print("请输入被考核人姓名：");
        String name = input.next();
        System.out.print("外貌咋样？[1/0]：");
        a = input.nextInt();
        score += a == 1 ? 50 : 0;
        System.out.print("性格好不好？[1/0]：");
        b = input.nextInt();
        score += b == 1 ? 30 : 0;
        System.out.print("能力强不强？[1/0]：");
        c = input.nextInt();
        score += c == 1 ? 20 : 0;
        System.out.println(name + "得分" + score + "分");
    }
}
