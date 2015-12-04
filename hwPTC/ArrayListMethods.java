import java.util.*;

public class ArrayListMethods{

    /*Remove any consecutive duplicates in the ArrayList
     *@param L The values which may contain duplicates 
     */
    public static void collapseDuplicates( ArrayList<Integer> L ) 
    {

	int i = 0;
	while (i < L.size()-1)
	    {
		if (L.get(i)==L.get(i+1))
		    {
			L.remove(i);
		    }
		else
		    {
			i++;
		    }
	    }
    }

    /*Change the order of the elements of L into a random permutation
     *@param L The values to be put into random order
     */
    public static void randomize( ArrayList<Integer> L) 
    {
	for(int i = 0;i < L.size();i++)
	    {
		int n = (int)(Math.random()*(L.size()-i) + i);
		int x = L.get(n);
	        L.set(n,L.get(i));
	        L.set(i,x);
	
	    }
    }
    //How many operations do you perform on a list of size N? (in terms of N)
    //How much extra space did you use in order to complete this problem? (in terms of N)
    //Try to use less space/fewer operations. 
    //->The minimum would be NO extra space, and just k*N operations, for a small integer k.
    

    public static void main(String[]args){
        //test your functions here.
	ArrayList L = new ArrayList(Arrays.asList(1,1,1,2,2,3,7,9));
	collapseDuplicates(L);
	System.out.println(L);
	randomize(L);
	System.out.println(L);

	
    }
}