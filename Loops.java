public class Loops
{

    public static void main(String[]args)
    {
	/*
	int x = 1;
	while (x<=20)
	    {
		System.out.println(x);
		x++;
	    }

	for (int y = 1;y<=20;y++)
	    {
		System.out.println(y);
	    }
*/
	/*
	int x = 2;
	while (x<=20)
	    {
		System.out.println(x);
		x+=2;
	    }

	for (int y = 2;y<=20;y+=2)
	    {
		System.out.println(y);
	    }
	*/
	/*   
	int x = 1;
	while (x<=20)
	    {
		if (x%3 == 0)
		    {
			System.out.println(x);
		    }
	
		x++;
	    }

	for (int y = 1;y<=20;y++)
	    {
		if (y%3 == 0)
		    {
                                System.out.println(y);
		    }
	
	    }
	*/
	/*
	int x = 1;
	String str = "";
	while (x<=20)
	    {
		if (x == 20)
		    {
			str += "+ 20";
		    }
		else
		    {
			str += "+ " +x+ " + ";
		    }
	
		x++;
	    }

	for (int y = 1;y<=20;y++)
	    {
		if (y == 20)
		    {
			str += "+ 20";
		    }
		else
		    {
			str += "+ "+y+ " + ";
		    }
	
	    }
	*/

	/*
	int x = 1;                                                                                                                                                                                          
        int  sum = 0;                                                                                                                                                                               
        while (x<=20)                                                                                                                                                                                       
            {                                                                                                                                                                                               
                if (x%2 != 0)                                                                                                                                                                                
                    {                                                                                                                                                                                       
                        sum += x;
			System.out.println(sum);                                               }                                                                               
	x++;
             
	    }                           
		
	sum = 0;                
		for (int y = 1;y<=20;y++)                                                                                                                                                                           
            {                                                                                                                                                                                               
                if (y%2 != 0)            
                    {                                                                                                                                                                                       
                        sum += y;
			System.out.println(sum);
                    }                                                                                                                                                     }        
	*/
	/*
	int x = 1;
	double sum = 0;
	while (x<=10)
	    {
		sum+=1/(Math.pow(3,x));
		x++;
	    }
	System.out.println(sum);

	sum =0;
	for(int y=1;y<=10;y++)
	    {
		sum+=1/(Math.pow(3,y));
	    }
	System.out.println(sum);
	*/

	int x = 1;
	double sum = 0;
	while(x<=10)
	    {
		sum+=1/(Math.pow(x,3));
		x++;
	    }
	System.out.println(sum);
	sum = 0;

	for(int y=1;y<=10;y++)
	    {

		sum+=1/(Math.pow(y,3));
	    }
	System.out.println(sum);
   }


}