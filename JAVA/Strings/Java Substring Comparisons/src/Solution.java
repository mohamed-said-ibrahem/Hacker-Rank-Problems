import java.util.Scanner;

public class Solution {
    public static String getSmallestAndLargest(String s, int k) {
        String arr[] = new String[100000];
        String first,second,last="";
        String smallest = "";
        String largest = "";
        if(s.length()==k){
            return s + "\n" + s;
        }
        for(int i=0;i<=s.length()-k;i++){
            String sav="";
            for(int j = i;j<k+i;j++){
                sav = sav + s.charAt(j);
            }
            arr[i] = sav;
        }
            first = arr[0];
        for(int l=1;l<=s.length()-k;l++){
            second = arr[l];
            if(first.compareTo(second)>0){
               if(first.compareTo(largest)>0){largest = first;}
                first = second;
            }else if(first.compareTo(second)<0){
                if(second.compareTo(largest)>0){largest = second;}
            }   
        }
        smallest = first;
        
        return smallest + "\n" + largest;
    }
	

    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();
  
    System.out.println(getSmallestAndLargest(s, k));
}
}