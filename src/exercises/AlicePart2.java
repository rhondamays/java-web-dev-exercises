package exercises;

import java.util.Scanner;
public class AlicePart2 {
    public static void main(String[] args) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a word to search for: ");
        String searchTerm = input.nextLine().toLowerCase();
        input.close();

        System.out.println(searchTerm +" has the index of: "+ quote.toLowerCase().indexOf(searchTerm) + " and has a length of: " + searchTerm.length());

        String updatedQuote = quote.replace(searchTerm, "");

        System.out.println(updatedQuote);
    }
}
