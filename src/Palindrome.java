import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        String reverse = sb.reverse().toString();
        System.out.println("Reverser of " + str +": " + reverse);

        if(str.equalsIgnoreCase(reverse))
        {
            System.out.println("String is Palindrome");
        }
        else
        {
            System.out.println("String is not Palindrome");
        }

    }
}
