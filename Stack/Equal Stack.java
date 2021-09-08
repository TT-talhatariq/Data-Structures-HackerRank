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
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3, int h1_sum, int h2_sum, int h3_sum) {
        // Write your code heh1

        if (h1_sum == 0 || h2_sum == 0 || h3_sum == 0)
            return 0;

        if (h1_sum == h2_sum && h2_sum == h3_sum)
            return h1_sum;


        if ((h1_sum > h2_sum && h1_sum > h3_sum) || (h1_sum>h2_sum && h1_sum==h3_sum) || (h1_sum>h3_sum && h1_sum==h2_sum)) {
            h1_sum -= h1.get(0);
            h1.remove(0);
        }

        else if ((h2_sum > h1_sum && h2_sum > h3_sum) || (h2_sum>h1_sum && h2_sum==h3_sum) || (h2_sum>h3_sum && h2_sum==h1_sum)) {
            h2_sum -= h2.get(0);
            h2.remove(0);
        }

        else if ((h3_sum > h2_sum && h3_sum > h1_sum) || (h3_sum>h2_sum && h3_sum==h1_sum) || (h3_sum>h1_sum && h3_sum==h2_sum)) {
            h3_sum -= h3.get(0);
            h3.remove(0);
        }
        return equalStacks(h1, h2, h3, h1_sum, h2_sum, h3_sum);
    }
}

    class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n1 = Integer.parseInt(firstMultipleInput[0]);

            int n2 = Integer.parseInt(firstMultipleInput[1]);

            int n3 = Integer.parseInt(firstMultipleInput[2]);

            List<Integer> h1 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> h2 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            List<Integer> h3 = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());


            int h1_sum = 0, h2_sum = 0, h3_sum = 0;
            for (int i : h1) {
                h1_sum += i;
            }

            for (int i : h2) {
                h2_sum += i;
            }

            for (int i : h3) {
                h3_sum += i;
            }

            int result = Result.equalStacks(h1, h2, h3, h1_sum, h2_sum, h3_sum);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

