package Homework.Package;

import java.util.Scanner;

//4. Numbered Hourglass
//Print an hourglass pattern with numbers. Example:
//
//        12345
//         234
//          3
//         234
//        12345
public class HourGlass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of HourGlass: ");
        int n = sc.nextInt();

//        12345
//         234
//          3

        for(int i=0;i<(n/2)+1;i++)
        {
            for(int k=0;k<i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-(i*2);j++)
            {
                System.out.print(i+j);
            }
            System.out.println();
        }

//         234
//        12345

        for(int i=n/2-1;i>=0;i--)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=n-(i*2);j++)
            {
                System.out.print(i+j);
            }
            System.out.println();
        }
    }
}
