package Project;

public class TaskNr3 {
    //Reverse a String: Write a function to reverse a given string. For example,
    //given the input "Hello", the output should be "olleH".
    public static void main(String[] args) {
        String a="Hello";
        String b=new StringBuilder(a).reverse().toString();
        System.out.println("Reversed "+a+" String is "+b);
        }
    }
