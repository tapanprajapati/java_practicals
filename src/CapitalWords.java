public class CapitalWords
{
    public static void main(String[] args)
    {
        String s = "This is a nEw String";
        int caps=0;

        String[] words = s.split(" ");
        //[This,is,a,nEw,String]

        for(int i=0;i<words.length;i++) {
            String word = words[i];
            //String
            if(Character.isUpperCase(word.charAt(0))) // S
            {
                caps++;
            }
        }
        System.out.println("Caps: "+caps);
    }
}
