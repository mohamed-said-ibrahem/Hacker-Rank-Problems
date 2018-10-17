import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;
  	
  	//start of code
    Difference(int []b){
        this.elements = new int[b.length];
        for(int i = 0;i < b.length;i++){
            this.elements[i] = b[i];
        }
    }
public void computeDifference(){
    int maxi = 0;
    for(int j = 0;j < elements.length;j++){
        for(int k = j+1;k < elements.length;k++){
            maxi = Math.max(maxi,Math.abs(elements[j]-elements[k]));
            }
    }
    maximumDifference = maxi;
}
    
//end of code
} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}