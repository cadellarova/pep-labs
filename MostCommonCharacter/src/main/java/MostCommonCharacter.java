import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        char mostFrequent = ' ';
        int frequency = 0;

        for(int i = 0; i < str.length(); i++){
            if(!chars.containsKey(str.charAt(i))){
                chars.put(str.charAt(i), 1);
            }
            else{
                chars.put(str.charAt(i),chars.get(str.charAt(i))+1);
                if(chars.get(str.charAt(i)) > frequency){
                    frequency = chars.get(str.charAt(i));
                    mostFrequent = str.charAt(i);
                }
            }
        }
        return mostFrequent;
    }
}
