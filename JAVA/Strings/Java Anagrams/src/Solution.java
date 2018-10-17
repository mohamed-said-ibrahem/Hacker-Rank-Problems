import java.util.Scanner;

public class Solution {
	
    static boolean isAnagram(String a, String b) {
        int arr[] = new int[123];
        int secArr[] = new int[123];
        String first = a.toLowerCase();
        String second = b.toLowerCase();
        int aLength = a.length();
        int bLength = b.length();
        if(aLength != bLength){return false;}
        for(int i = 0;i < aLength;i++){
            char test = first.charAt(i);
            int ascii = (int) test;
            arr[ascii] = arr[ascii] + 1;
        }
        for(int j = 0;j < bLength;j++){
            char testSec = second.charAt(j);
            int asciiSec = (int) testSec;
            secArr[asciiSec] = secArr[asciiSec] + 1;
        }
        for(int k = 0;k < 123;k++){
            if(arr[k]!=secArr[k]){
                return false;
            }
        }
        return true;
    }
	
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

}