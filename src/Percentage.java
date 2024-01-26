import java.util.Scanner;

public class Percentage
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int[] marks = new int[6];

        for (int i=0;i<=5;i++)
        {
            System.out.println("Enter Marks of Subject " + (i+1) + " :");
            marks[i] = sc.nextInt();
        }

        float total=0;

        for (int i=0;i<=5;i++)
        {
            total = total + marks[i];
        }

        float percentage = total / 6;
        System.out.println("Percentage is: "+percentage);
    }
}
