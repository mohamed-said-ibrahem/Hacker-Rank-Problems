import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int len = A.length()+B.length();
        System.out.println(len);
        if(A.charAt(0)<B.charAt(0)||A.charAt(0)==B.charAt(0)){System.out.println("No");}
        else{System.out.println("Yes");}
        String outputFirst = A.substring(0, 1).toUpperCase() + A.substring(1);
        String outputSecond = B.substring(0, 1).toUpperCase() + B.substring(1);

        System.out.println(outputFirst+" "+outputSecond);
    }
}



