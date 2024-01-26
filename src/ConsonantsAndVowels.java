public class ConsonantsAndVowels
{
    public static void main(String[] args)
    {
        String s = "this is a new string";

        int consonant=0;
        int vowel=0;

        for(int i=0;i<s.length();i++)
        {
            Character c = s.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'
                    || c =='A' || c == 'E' || c=='I' || c=='O' || c=='U')
            {
                vowel++;
            }
            else
            {
                if(c!=' ')
                {
                    consonant++;
                }
            }
        }

        System.out.println("Consonants: "+consonant);
        System.out.println("Vowels: "+vowel);
    }
}
