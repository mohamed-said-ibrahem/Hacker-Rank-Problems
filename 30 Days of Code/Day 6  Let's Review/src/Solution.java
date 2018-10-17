import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i=0;i<n;i++){
            String number = scan.next();
            for(int j = 0;j<number.length();j+=2){
                System.out.print(number.charAt(j));
            }
            System.out.print(" ");
            for(int k = 1;k<number.length();k+=2){
                System.out.print(number.charAt(k));
            }
            System.out.println();  
        }
    }
}