// package Lamex;
// import java.util.function.BiFunction;
// public class sum {
//     public static void main(String[] args) {
//         BiFunction<Integer, Integer, Integer> sum = (a, b) -> a + b;

//         int result = sum.apply(10, 20);
//         System.out.println("Sum: " + result);
//     }
// }

public class ReverseString {

    // Recursive method to reverse a string
    public static String reverse(String str) {
        // Base case: if the string is empty or has only one character, return the string itself
        if (str.isEmpty()) {
            return str;
        }

        // Recursively reverse the substring starting from the second character
        // Then append the first character to the end of the reversed substring
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        String str = "hello";

        String reversedStr = reverse(str);
        System.out.println("Original String: " + str);
        System.out.println("Reversed String: " + reversedStr);
    }
}
