public class Test
{
    public static String [] makeThreesome(String word)
    {
        String [] threes = new String[word.length()-2];
        String [] chars = word.split("");

        // Your code here
        for(int i=0; i<word.length()-2; i++)
        {
            threes[i] = chars[i] + chars[i+1] + chars[i+2];
        }

        return threes;
    }
}