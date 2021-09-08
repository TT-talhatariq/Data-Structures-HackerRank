import java.util.Scanner;

class Result {
    public static int hourglassSum(int[][] array) {
        // Write your code here
        int max = Integer.MIN_VALUE;
        for(int i=0; i<4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                if (sum >= max)
                    max = sum;
            }
        }
        return max;
    }
}
public class Solution {
    static public void main(String [] args){

        int [][]array = new int[6][6];
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<6;i++){
            for (int j=0;j<6; j++){
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println(Result.hourglassSum(array));
        /*
        GameFrame frame = new GameFrame();


         */
    }
}
