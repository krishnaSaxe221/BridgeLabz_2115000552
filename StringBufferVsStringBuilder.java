
public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int iterations = 1000000; // 1 million iterations
        String testString = "hello";

        // Measure time for StringBuffer concatenation
        long startTime = System.nanoTime();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append(testString);
        }
        long endTime = System.nanoTime();
        long stringBufferTime = endTime - startTime;
        System.out.println("Time taken by StringBuffer: " + stringBufferTime + " nanoseconds");

        // Measure time for StringBuilder concatenation
        startTime = System.nanoTime();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append(testString);
        }
        endTime = System.nanoTime();
        long stringBuilderTime = endTime - startTime;
        System.out.println("Time taken by StringBuilder: " + stringBuilderTime + " nanoseconds");

        // Compare the results
        if (stringBufferTime < stringBuilderTime) {
            System.out.println("StringBuffer is faster.");
        } else if (stringBufferTime > stringBuilderTime) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("Both StringBuffer and StringBuilder took the same time.");
        }
    }
}
