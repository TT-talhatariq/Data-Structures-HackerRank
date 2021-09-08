import java.util.*;
class Result {


    public static void matchingStrings(String[] strings, String[] queries) {
        // Write your code here
       int ocu = 0;
       for(String j:queries){
           for(int i=0; i<strings.length; i++){
               if(strings[i].equals(j)){
                   ocu++;
               }
           }
           System.out.println(ocu);
           ocu = 0;
       }
       
    }

}

public class Solution {
    public static void main(String[] args) {
        int s,q;
        String []string;
        String []queries;
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextInt();

        string = new String[s];
        for (int i=0; i<s; i++){
            string[i] = scanner.next();
        }

        q = scanner.nextInt();

        queries = new String[q];
        for (int i=0; i<q; i++){
            queries[i] = scanner.next();
        }
        
        Result.matchingStrings(string, queries);
    }

}
