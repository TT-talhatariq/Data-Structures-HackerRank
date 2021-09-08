import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Result {

    public static void dynamicArray(int n, int [][] queries) {
        // Write your code here

        int [][] arr = new int[n][100];
        int LastAns = 0;
        for (int i=0; i<n; i++){
            arr[i][99] = 0;
        }
        for (int i = 0; i<queries.length; i++){
            
            int idx = (queries[i][1] ^ LastAns) % n;

            if(queries[i][0] == 1) {
                    arr[idx][arr[idx][99]] = queries[i][2];
                    arr[idx][99]++; 
            }
            else {
                    LastAns = arr[idx][queries[i][2] % arr[idx][99]];
                    System.out.println(LastAns);
            }

        }


    }
}

public class Solution {
    static public void main(String [] args){

        Scanner scanner  = new Scanner(System.in);
        int n,q;
        n = scanner.nextInt();
        q = scanner.nextInt();
        int [][] queries = new int[q][3];
        for(int i=0; i<q; i++){
            for (int j=0; j<3; j++){
                queries[i][j] = scanner.nextInt();
            }
        }
        Result.dynamicArray(n, queries);
        /*
        GameFrame frame = new GameFrame();


         */
    }
}
