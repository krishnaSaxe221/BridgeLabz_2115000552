public class WordReplace {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful.";
        String wordToReplace = "Java";
        String replacementWord = "Python";

        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replaceAll("\\b" + wordToReplace + "\\b", replacementWord);
    }
}

