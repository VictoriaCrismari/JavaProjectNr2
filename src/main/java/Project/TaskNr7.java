package Project;

public class TaskNr7 {
    //Count the Number of Words in a String: Write a function to count the
    //number of words in a given string. Words are separated by spaces or
    //punctuation. For example, the input "Hello, world!" should return 2.
    public static void main(String[] args) {
        String a="Hello, world!";
        //There are few ways and I will list two of them
        //int wordsCount= a.split("[!._,'@?//s]").length;
        //System.out.println("There are "+wordsCount+" words in the given String");
        String [] wordsCount=a.split("[\\s\\p{Punct}]+");
        System.out.println("There are "+wordsCount.length+" words in the given String");
    }
}
