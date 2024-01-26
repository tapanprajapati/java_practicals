import java.util.Scanner;

public class StringLength
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String s = sc.nextLine();

        int length = s.length();
        System.out.println("Length of the string is: "+ length);
        System.out.print("Second half of the string is: ");

        for(int i=(length/2);i<length;i++)
        {
            System.out.print(s.charAt(i));
        }
    }
}
