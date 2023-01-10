import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Collect the string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Pass the input to the worker class
        Worker worker = new Worker();
        worker.passInfo(input);

        // Run the methods to count the vowels, reverse the string, and check if it's a palindrome
        worker.countVowels();
        worker.reverse();
        worker.checkPalindrome();

        // Display all the outputs that the worker class generates
        System.out.println(worker.toString());

        // Close the scanner
        scanner.close();
    }
}


