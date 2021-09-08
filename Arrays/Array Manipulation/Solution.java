
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    long  n,q;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextLong();
        q = scanner.nextLong();
       long a,b,k;

       long [] arr = new long[Math.toIntExact(n+1)];
       Arrays.fill(arr, 0);

        for(long i=0; i<q; i++){

            a = scanner.nextLong();
            b = scanner.nextLong();
            k = scanner.nextLong();

            arr[Math.toIntExact(a)] += k;
            if((b+1)<=n)
                arr[Math.toIntExact(b + 1)]-=k;
        }
        long max = 0, x = 0;
        for(int i=1; i<=n; i++){
            //System.out.print(i+" ");
            x = x+arr[i];
            if(x>max)
                max = x;
        }
        System.out.println(max);


    }

}
