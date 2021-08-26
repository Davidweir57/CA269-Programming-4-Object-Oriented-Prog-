import java.util.*;
public class testWordLenght
{
    
    public static void main(String [] args)
    {
        Map<Integer, Integer> map = new HashMap<>();
        Scanner input = new Scanner(System.in);
        
        while (input.hasNext()){
            String sentence = input.nextLine();
            String[] words = sentence.split(" ", 0);
            for (String word : words){
               if (!map.containsKey(word.length())){
                   map.put(word.length(), 1);
               }
               else{
                   int value = map.get(word.length()) + 1;
                   map.put(word.length(), value);
               }
            }
        }

        for (int i : map.keySet()){
                System.out.println(i + ": " + map.get(i));
        }

    }
}