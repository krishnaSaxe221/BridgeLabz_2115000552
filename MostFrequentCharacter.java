import java.util.HashMap;
import java.util.Map;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String input = "success";
        System.out.println("Most Frequent Character: '" + mostFrequentChar(input) + "'");
    }

    public static char mostFrequentChar(String input) {
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // Count frequency of each character
        for (char c : input.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find the character with the highest frequency
        char mostFrequentChar = input.charAt(0);
        int maxCount = 0;
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostFrequentChar = entry.getKey();
            }
        }

        return mostFrequentChar;
    }
}

