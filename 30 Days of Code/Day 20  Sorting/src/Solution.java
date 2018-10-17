import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static Integer[] swap(Integer a, Integer b) {
       return new Integer[]{b, a};
    }
    static int first;
    static int last;
    static int numberOfSwaps = 0;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {

        for (int j = 0; j < n - 1; j++) {
          if (a[j] > a[j + 1]) {
            Integer[] intArray = swap(a[j], a[j + 1]);
            a[j] = intArray[0];
            a[j+1] = intArray[1];
             numberOfSwaps++;
            }
        }
            first = a[0];
            last = a[n-1];
          if (numberOfSwaps == 0) {
             break;
            }        
        } 
        System.out.println("Array is sorted in "+numberOfSwaps+" swaps.");
        System.out.println("First Element: "+first);
        System.out.println("Last Element: "+last);

               
        
    }
}