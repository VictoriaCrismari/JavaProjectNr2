package Project;

public class TaskNr4 {
    //Check if a String is Palindrome: Determine whether a given string is a
    //palindrome, which means it reads the same forwards and backward. For
    //example, "madam" is a palindrome.
    public static void main(String[] args) {
        String a = "Kayak";
        String b = new StringBuilder(a).reverse().toString();
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Given String is palindrome");
        } else {
            System.out.println("Given String is not palindrome");
        }
    }
}
