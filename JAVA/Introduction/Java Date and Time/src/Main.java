import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

//start of code
import java.util.*;

public class Main {
    
public static String getDay(String day,String month,String year){
    int newMonth =  Integer.parseInt(month);
    int newYear =  Integer.parseInt(year);
    int newDay =  Integer.parseInt(day);    
    Date date = new Date(newYear-1900, newMonth-1, newDay);
    Calendar cal = Calendar.getInstance();
    cal.setTime(date);
    int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
    
    if(dayOfWeek==0){return "SATURDAY";}
    else if(dayOfWeek==1){return "SUNDAY";}
    else if(dayOfWeek==2){return "MONDAY";}
    else if(dayOfWeek==3){return "TUESDAY";}
    else if(dayOfWeek==4){return "WEDNESDAY";}
    else if(dayOfWeek==5){return "THURSDAY";}
    else if(dayOfWeek==6){return "FRIDAY";}
    else if(dayOfWeek==7){return "SATURDAY";}
    else{
        return "NOT FOUND";
    }
}

//end of code

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
