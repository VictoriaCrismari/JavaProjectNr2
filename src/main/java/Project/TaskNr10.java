package Project;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class TaskNr10 {
    //How can you remove all duplicates from ArrayList?
    public static void main(String[] args) {
        ArrayList <String> arr=new ArrayList<>();
        arr.add("apple");
        arr.add("kiwi");
        arr.add("apple");
        arr.add("lemon");
        System.out.println(arr);
        ArrayList <String> newArr=new ArrayList<>();
        for (String element : arr) {
            if (!newArr.contains(element)) {
                newArr.add(element);
            }
        }System.out.println("Array without duplicates: "+newArr);
    }
}
