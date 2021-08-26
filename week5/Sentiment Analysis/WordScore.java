public class WordScore
{
    int score;
    String word;

    public WordScore(String str)
    {
        this.word = str;
    }

    public int score(String input)
    {
        String [] line = input.split(" ");
        score = Integer.parseInt(line[1]);

        for(int i=0; i<line.length; i++)
        {
            if(word.equals(line[i]))
            {
                return score;
            }
        }

        return -1;
    }
}
