package Project;

public class TaskNr2 {
    //Find out how many alpha characters are present in a string?
    public static void main(String[] args) {
        String m="ftyguwf568487@&%(33gbhjgn";
        int count=m.replaceAll("[^A-Za-z]","").length();
        System.out.println("There are "+count+" alpha characters in the given String");

        }
    }
