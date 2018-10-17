import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s="";
        try{s = scan.nextLine();}
        catch(Exception e){
        }
        String r = null;
        String[] parts = null;
         // ([' ',!,?._'@]+)
        
        if(s == ""){
              System.out.println("0");
              return;
        }
        else if(s.length() > 400000){
             return;
        }
        else{
         parts = s.split("([' ',!,?._'@]+)");
            r = s.trim();
        if(parts.length==0){
                System.out.println("0");
              return;
        }
        if((parts[0] == null) || (parts[0].trim().length() == 0)){
            System.out.println(parts.length-1);

        }
        else{
             System.out.println(parts.length);}
        }
        for(int i=0;i<parts.length;i++){
            if((parts[i] == null) || (parts[i].trim().length() == 0)){
                
            }else{System.out.println(parts[i]);}

        }
            scan.close();

    }
}
