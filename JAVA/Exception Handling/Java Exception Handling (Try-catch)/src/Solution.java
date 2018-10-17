import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try{
            int x = scan.nextInt();
            int y = scan.nextInt();
            int div = x/y;
            if(y == 0){throw new ArithmeticException();}
            System.out.println(div);
        }catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }catch (Exception e){
          System.out.println("java.util.InputMismatchException");
        }
    }
}