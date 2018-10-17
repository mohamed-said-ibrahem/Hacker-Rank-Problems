import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<Integer>();
        Iterator itr = l1.iterator(); 
        int n = scanner.nextInt();
        int maxi = 0,counter = 1;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String test = Integer.toBinaryString(n);
        for(int i = 0;i < test.length();i++){
            counter = 1;
            for(int j = i+1;j < test.length();j++){
                if(test.charAt(i)=='0'){
                    break;
                }else{
                    if(test.charAt(j)=='1'){counter++;}
                    else{break;}
                }
            }
            maxi = Math.max(maxi, counter);
        }
        System.out.println(maxi);
        // while(n > 0){
        //   remainder = n%2;
        //   n = n/2;
        //   l1.add(remainder); 
        // }
        // while (itr.hasNext()) 
        // { 
        //     int i = (Integer)itr.next();   
        // } 
        
        scanner.close();
    }
}
