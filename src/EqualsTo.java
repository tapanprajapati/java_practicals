public class EqualsTo
{
    public static void main(String[] args) {
        String str = "Nothing is impossible";

        System.out.println("Length: " + str.length());
        System.out.println("Half of the string: " + str.substring(0,str.length()/2));
        System.out.println("Second half: " + str.substring(str.length()/2, str.length()));
        System.out.println("Replacing s with a: " + str.replace("s","a"));
        System.out.println("Replacing first s with a: " + str.replaceFirst("s","a"));
        System.out.print("Splitting with space: ");
        System.out.println("[\"Nothing\",\"is\",\",\"impossible\"]");
        System.out.println("Words in string: " + str.split(" ").length);
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Position of i: " + str.indexOf("i"));
        System.out.println("Adding string: " + str.concat(" in this world"));
        System.out.println("Does string contain earth ? :" + str.contains("earth"));
    }
}
