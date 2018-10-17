import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {

    // Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = 0;
        int maxi = -100000000;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                sum = 0;
                for(int k =j;k<j+3;k++){
                    for(int l =i;l<i+3;l++){
                        if((l==i+1&&k==j)||(l==i+1&&k==j+2)){}
                       else{sum = sum + arr[l][k];}
                       // sum = sum + arr[l][k];
                    }
                }
                //sum = sum - arr[i+1][j] - arr[i+1][j+2];
                maxi = Math.max(maxi,sum);
            }
        }
        return maxi;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        int result = hourglassSum(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
