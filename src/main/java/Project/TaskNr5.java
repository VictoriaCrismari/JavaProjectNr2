package Project;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TaskNr5 {
    //Check if Two Strings are Anagrams: Given two strings, determine if they
    //are anagrams, meaning they contain the same characters in a different order.
    //For example, "listen" and "silent" are anagrams.
    public static void main(String[] args) {
        String a="listen";
        String b="silent";
        char [] String1=a.toCharArray();
        char [] String2=b.toCharArray();
        Arrays.sort(String1);
        Arrays.sort(String2);
        if (Arrays.equals(String1,String2)){
            System.out.println("Given Strings are anagrams");
        }else System.out.println("Given Strings are not anagrams");
    }
}
