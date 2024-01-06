package Project;

public class TaskNr1 {
    //Write a program to swap 2 String without a temporary variable?
    public static void main(String[] args) {
        String n1="Syntax";
        String n2="Technologies";
        n1 = n1 + n2;
        n2 = n1.substring(0, n1.length() - n2.length());
        n1 = n1.substring(n2.length());
        System.out.println("Nr1 string= "+n1);
        System.out.println("Nr2 string= "+n2);
    }
}
