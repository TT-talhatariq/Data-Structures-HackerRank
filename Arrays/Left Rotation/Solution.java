import java.util.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
           Scanner scanner = new Scanner(System.in);
        int n,d, start;
        n = scanner.nextInt();
        d = scanner.nextInt();
        start = n-d;
        
        int [] arr  = new int[n];
        
        for(int i=0; i<n; i++){
            if(start == n){
                start = 0;
            }
                
            arr[start++]  = scanner.nextInt();
        }
        for(int i:arr){
           System.out.print(i + " ");
        }
    }
}
