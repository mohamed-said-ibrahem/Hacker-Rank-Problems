import java.util.Scanner;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int total = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            for(int j = 0;j < n;j++){
                if(j==0)total = total + a;
                total = total + (int)(Math.pow(2,j)*b);
                System.out.print(total+" ");
            }System.out.println("");
        }
        in.close();
    }
}