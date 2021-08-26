public class Test
{
    // This method returns a String and receives a String
    public static String firstShallBeLast(String word)
    {
        // Reorganise the string.  Remember the '+' operator concatenates strings.
        // Needs to return the correct string.
        return (word.substring((word.length() - 1)) + word.substring(1, (word.length() - 1)) + word.substring(0, 1));
    }
}