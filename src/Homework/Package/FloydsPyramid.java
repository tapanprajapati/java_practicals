package Homework.Package;

import java.util.Scanner;

//2. Floyd's Triangle
//Print Floyd's Triangle with numbers. Example:
//
//        1
//        2 3
//        4 5 6
//        7 8 9 10
public class FloydsPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num=1;
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num++);
            }
            System.out.println();
        }
    }
}


