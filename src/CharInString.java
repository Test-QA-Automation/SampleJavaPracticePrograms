public class CharInString
{
    public static void main(String[] args)
    {
        String word = "Batsman";

        System.out.println(word);

        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);
            System.out.println(c);
        }
    }
}
