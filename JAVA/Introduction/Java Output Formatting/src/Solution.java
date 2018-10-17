import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                int length = 15 - s1.length();
                System.out.print(s1);
                for(int j = 0; j < length; j++)System.out.print(" ");
                if(x<100&&x>0){System.out.print("0");}
                else if(x==0){System.out.print("00");}
                System.out.println(x);
            }
            sc.close();
            System.out.println("================================");

    }
}
