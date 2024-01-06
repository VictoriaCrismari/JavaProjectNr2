package Project;

public class TaskNr6 {
    //Create a method to count how many vowels are present in a string
    //“documentation”
    public static void main(String[] args) {
        String a="documentation";
       Long vowels=a.replaceAll("[^aeiou]","").chars().count();
        System.out.println("Given String "+a+" has "+vowels+" vowels");
    }
}
