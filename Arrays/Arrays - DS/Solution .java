import java.util.Scanner;
class Result{
    public static void reverseArray(int [] a){
        int j = a.length-1;
        for(int i=0; i<a.length/2; i++){
            int tmp = a[i];
            a[i] = a[j];
            a[j] = tmp;
            j--;
        }
    }
}
public class Solution {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int [] array = new int[scan.nextInt()];
        for (int i=0; i<array.length; i++){
            array[i] = scan.nextInt();
        }
        Result.reverseArray(array);
        for(int i:array){
            System.out.print(i+ " ");
        }


    }
}
