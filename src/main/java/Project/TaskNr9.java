package Project;

public class TaskNr9 {
    //Find the First Non-Repeating Character in a String: Given a string, find and
    //return the first non-repeating character. For example, in the string
    //"abracadabra", the first non-repeating character is 'c'.
    public static void main(String[] args) {
        String a="abracadabra";
        String b=new StringBuilder(a.toLowerCase()).toString();
        for (int i = 0; i <b.length() ; i++) {
            int count=0;
            for (int j = 0; j < b.length(); j++) {
                if (b.charAt(i)==b.charAt(j)&&i!=j){
                    count=1;
                    break;
                }
            }if (count==0){ System.out.println("First non-repeating character is: "+b.charAt(i));
                break;}

        }

    }
}
