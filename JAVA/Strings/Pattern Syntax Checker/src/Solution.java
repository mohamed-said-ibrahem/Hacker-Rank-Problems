import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        boolean found;
		while(testCases>0){
            found = true;
			String pattern = in.nextLine();
            try
            {
                Pattern newPattern = Pattern.compile(pattern);
            }catch (PatternSyntaxException pse) {
                found = false;
                System.out.println("Invalid");
            }
            if(found)System.out.println("Valid");
		}
	}
}
