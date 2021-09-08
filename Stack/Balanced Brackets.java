import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        // Write your code here

        Stack<Character> stack = new Stack<>();
        for(int st = 0; st < s.length(); st++){
            if(s.charAt(st) == '(' || s.charAt(st) == '{' || s.charAt(st) == '[' )
                stack.push(s.charAt(st));

            else if(stack.isEmpty())
                return "NO";
            else if(s.charAt(st) == ')' ) {
                if(stack.pop()!='(')
                    return "NO";
            }
            else if(s.charAt(st) == '}' ) {
                if(stack.pop()!='{')
                    return "NO";
            }
            else if(s.charAt(st) == ']' ) {
                if(stack.pop()!='[')
                    return "NO";
            }
        }

        if(!stack.isEmpty())
            return "NO";
        return "YES";

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                String s = bufferedReader.readLine();

                String result = Result.isBalanced(s);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
