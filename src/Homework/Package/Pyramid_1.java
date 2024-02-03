package Homework.Package;

import java.util.Scanner;

//1. Reverse Number Pyramid
//Print a pyramid of numbers in reverse order. Example:
//
//        1
//        21
//        321
//        4321
public class Pyramid_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=i;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
