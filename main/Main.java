package by.htp.les01.main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double a, b, c;
       double resoult, temp;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter a");
        while (!sc.hasNextDouble()){
            sc.nextLine();System.out.println("Enter a");
        }
        a = sc.nextDouble();

        System.out.println("Enter b");
        while (!sc.hasNextDouble()){
            sc.nextLine();
            System.out.println("Enter b");
        }
        b = sc.nextDouble();
        System.out.println("Enter c");
        while (!sc.hasNextDouble()){
            sc.nextLine();
            System.out.println("Enter c");
        }
        c = sc.nextDouble();

        resoult = (((Math.sqrt(Math.pow(b,2) + 4 * a * c)) + b)  / 2 * a) - Math.pow(a, 3) * c + b;
        System.out.println(resoult);
    }
}
