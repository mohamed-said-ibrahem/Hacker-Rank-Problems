import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
      int counter = 0;
      Scanner scan = new Scanner(System.in);
      while(scan.hasNextLine()){
          String input  = scan.nextLine();
          counter++;
          System.out.println(counter+" "+input);
      }
      scan.close();
    }
}