package demo;

import java.util.Random;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int a = random.nextInt(10) + 50;
        while (true) {
            int b = sc.nextInt();

            if (b < a) {
                System.out.println("比生成的随机数大，请继续猜");
            } else if (b > a) {
                System.out.println("比生成的随机数小，请继续猜");
            } else {
                System.out.println("恭喜你，猜中了");
                break;
            }
        }
    }
}

