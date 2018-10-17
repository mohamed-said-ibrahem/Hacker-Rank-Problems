import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.*;

public class Solution {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        try{
            Integer number = Integer.parseInt(S);
            System.out.println(number);
           }
        catch(NumberFormatException e){
            System.out.println("Bad String");
        }
    }
}