
public class SentenceSearch {
    public static void main(String[] args) {
        String[] sentences = {
                "The quick brown fox jumps over the lazy dog.",
                "Java is a programming language.",
                "Linear search is an algorithm.",
                "Searching for a word in a sentence."
        };

        String wordToFind = "algorithm"; // The word we are searching for
        String result = findSentenceWithWord(sentences, wordToFind);

        System.out.println(result);
    }

    public static String findSentenceWithWord(String[] sentences, String word) {
        // Iterate through the list of sentences
        for (String sentence : sentences) {
            if (sentence.contains(word)) {
                return sentence; // Return the sentence if it contains the word
            }
        }
        return "Not Found"; // Return "Not Found" if no sentence contains the word
    }
}
