package TestAll;

import java.util.Scanner;

public class Firstday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("age :");
        int age = scan.nextInt();

        System.out.print("name :");
        String name = scan.nextLine();

        System.out.print("high :");
        double high = scan.nextDouble();

        System.out.println("age = " + age);
        System.out.println("high = " + high);
        System.out.println("name = " + name);
    }
}
