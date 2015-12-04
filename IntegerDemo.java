import java.util.*;
import java.lang.*;


public class IntegerDemo
{


    public static void main(String[] args)
    {
	ArrayList blah = new ArrayList(Integer.parseInt(args[0]));
	Random num = new Random(1);
	for(int i = 0;i < Integer.parseInt(args[0]);i++)
	    {
		blah.add(num.nextInt(10));
	    }
	


	System.out.println(blah.toString());
    }





}