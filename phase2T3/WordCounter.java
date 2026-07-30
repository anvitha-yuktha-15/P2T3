import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        int words = sentence.trim().isEmpty() ? 0 : sentence.trim().split("\\s+").length;
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int special = 0;

        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);

            if (Character.isLetter(ch)) {
                ch = Character.toLowerCase(ch);

                if ("aeiou".indexOf(ch) != -1)
                    vowels++;
                else
                    consonants++;
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (!Character.isWhitespace(ch)) {
                special++;
            }
        }

        System.out.println("Total Words: " + words);
        System.out.println("Total Vowels: " + vowels);
        System.out.println("Total Consonants: " + consonants);
        System.out.println("Total Digits: " + digits);
        System.out.println("Total Special Characters: " + special);

        sc.close();
    }
}