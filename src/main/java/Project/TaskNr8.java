package Project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TaskNr8 {
  //8. You have a list of strings and you want to keep only those that start with
  //“A” and you want to return them in lower case".
    public static void main(String[] args) {
      List<String> words1= Arrays.asList("Africa", "America", "China", "Canada");
      List<String> words2 = new ArrayList<>();
      for (String x : words1) {
        if (x.startsWith("A")) {
          String lowerCase = x.toLowerCase();
          words2.add(lowerCase);
        }
      }
      System.out.println("Strings starting with 'A' are : " + words2);

    }
}
