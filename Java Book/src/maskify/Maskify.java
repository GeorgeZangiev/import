import static org.junit.Assert.*;

import java.util.Scanner;
public class Maskify {
    public static void main (String[] args)
    {
    int j;
    String word="";
    char[] chr;
    System.out.println("Enter a Word:");
    Scanner keyboard = new Scanner(System.in);
    word= keyboard.nextLine();
    chr= word.toCharArray();
    int t = word.length();
    int i = word.length();
    
    if(i<t+4) {
    	t=t-1;
    	j = word.length()-1;
    }
    else {
    	
    }
    }
}
