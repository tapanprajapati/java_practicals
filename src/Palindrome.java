import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();

        boolean isPalindrome = true;

        for(int i=0;i<s.length()/2;i++)
        {
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
            {
                isPalindrome=false;
            }
        }

        if(isPalindrome)
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}
