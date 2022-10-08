package Rahulhome;
import java.util.*;

public class Demoo {
	 static String FirstAndLast(String str)
	    {
	 
	        // Split the String based on the space
	        String[] arrOfStr = str.split(" ");
	 
	        // String to store the resultant String
	        String res = "";
	 
	        // Traverse the words and
	        // remove the first and last letter
	        for (String a : arrOfStr) {
	            res += a.substring(1, a.length() - 1) + " ";
	        }
	 
	        return res;
	    }
	 
	    // Driver code
	    public static void main(String args[])
	    {
	        String str = "combination";
	        System.out.println(str);
	        System.out.println(FirstAndLast(str));
	    }

}
