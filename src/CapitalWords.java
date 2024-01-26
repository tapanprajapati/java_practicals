public class CapitalWords
{
    public static void main(String[] args)
    {
        String s = "This is a nEw String";
        //Caps=3
        Character previousLetter = ' ';
        int caps=0;

        for(int i=0;i<s.length();i++)
        {
            if(previousLetter==' ')
            {
                if(Character.isUpperCase(s.charAt(i)))
                {
                    caps++;
                }
            }
            previousLetter = s.charAt(i);
        }

        System.out.println("Caps in string: "+caps);

    }
}
