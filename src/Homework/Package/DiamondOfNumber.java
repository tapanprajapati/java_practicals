package Homework.Package;

import java.util.Scanner;

//5.  Diamond of Numbers
//Print a diamond shape with numbers. Example:
//
//           1
//          121
//         12321
//        1234321
//         12321
//          121
//           1

public class DiamondOfNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();

//           1
//          121
//         12321
//        1234321

        for(int i=1;i<=n;i++)
        {
            for(int l=i;l<=n;l++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }

//         12321
//          121
//           1
        for(int i=n-1;i>=1;i--)
        {
            for(int l=i;l<=n;l++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(int k=i-1;k>=1;k--)
            {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
