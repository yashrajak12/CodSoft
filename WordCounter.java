import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Split the input text into an array of words using space or punctuation as delimiters
        String[] words = inputText.split("[\\s\\p{Punct}]+");

        // Initialize the counter variable
        int wordCount = 0;

        // Iterate through the array of words and increment the counter for each word encountered
        for (String word : words) {
            if (!word.isEmpty()) { // Ignore empty strings
                wordCount++;
            }
        }

        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }
}
