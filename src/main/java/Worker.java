 /*
 In Java, this is a keyword that refers to the current instance of the class, it can be used to refer to the current object's own methods,
 as well as those of its superclasses. It is often used to make it easier to tell the differences between local variables and instance variables when they have the same name,
 or to access instance variables when the same name is used for a method parameter.
 Here is an example:
*/
/*
public class MyClass {
    private int myInt;

    public MyClass(int myInt) {
        // Here, this.myInt refers to the instance variable, and myInt refers to the method parameter
        this.myInt = myInt;
    }
}
*/


public class Worker {
    // Global variables to store the input string and the results of the vowel count,
    // the reversed string, and the palindrome check
    private String input;
    private int vowelCount;
    private String reversed;
    private boolean isPalindrome;

    // Constructor method to initialize the global variables
    public Worker() {
        this.input = "";
        this.vowelCount = 0;
        this.reversed = "";
        this.isPalindrome = false;
    }

    // Method to collect the data passed from the main class
    public void passInfo(String input) {
        this.input = input;
    }

    // Method to count the number of vowels in the input string, excluding 'y'
    public void countVowels() {
        for (int i = 0; i < this.input.length(); i++) {
            char c = this.input.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                this.vowelCount++;
            }
        }
    }

    // Method to reverse the input string using a loop
        public void reverse() {
        // Create a StringBuilder object to efficiently build the reversed string.
        StringBuilder reversedString = new StringBuilder();

        // Loop through the input string in reverse order.
        for (int i = this.input.length() - 1; i >= 0; i--) {
            // Append each character to the StringBuilder.
            reversedString.append(this.input.charAt(i));
        }

        // Set the instance variable "reversed" to the reversed string.
        this.reversed = reversedString.toString();
    }

    // Method to determine if the input string is a palindrome
    public void checkPalindrome() {
        this.isPalindrome = this.input.equals(this.reversed);
    }

    // Method to return the results as a string
    public String toString() {
        return "Vowel Count: " + this.vowelCount + "\nReverse: " + this.reversed + "\nPalindrome: " + this.isPalindrome;
    }
}

