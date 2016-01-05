import java.util.Arrays;



public class Sorts
{

    public static int indexOf(int[] nums,int num)
    {
       
	for(int i = 0;i < nums.length;i++)
	    {
		if (nums[i]==num)
		    {
			return i;
		    }
	    }
	return -1;
    }

    public static void printArray(int[]data)
    {
	String strArray = "";
	for (int i = 0;i < data.length-1;i++)
	    {
		strArray+=data[i] + ",";
	    }
	System.out.println( "["+strArray+data[data.length-1]+"]");
    }
    
    public static void insertion(int data[])
    {
	boolean sorted = false;
	if (data.length <= 1)
	    {
		sorted = true;
	    }

	while (!sorted)
	    {
		for (int j = 0;j<data.length-1;j++)
		    {
			if (data[j] > data[j+1])
			    {
				int old = data[j];
				int newV = data[j+1];
				data[j] = newV;
				data[j+1] = old;
			    }
		    }
		for (int j = 0;j<data.length-1;j++)
                    {
			if (data[j] > data[j+1])
			    {
				sorted = false;
				j = data.length;
			    }
			else
			    {
				sorted = true;
			    }
                    }
            }
    }
    
    public static void selection(int nums[])
    {
	int count = 0;
	int temp;
	while(count<nums.length)
	    {
		int x = min(Arrays.copyOfRange(nums,count,nums.length));
		int index = count+indexOf(Arrays.copyOfRange(nums,count,nums.length),x);
		//		printArray(Arrays.copyOfRange(nums,count,nums.length-1));
		//System.out.println(x);
		//System.out.println(index);
		temp = nums[count];
		nums[count] = x;
		nums[index] = temp;
		count++;
	    }
    }
    
    public static int min(int nums[])
    {
	//	printArray(nums);
	int temp = nums[0];
	//	System.out.println("ayy");
	for(int i = 0;i<nums.length;i++)
	    {
		temp = Math.min(temp,nums[i]);
	    }
	return temp;
    }


    public static void main(String[] args)
    {
	int[] test1 = new int[] {1,9,4,6,8,0};
	printArray(test1);
	insertion(test1);
	printArray(test1);

	test1 = new int[]  {1,9,4,6,8,0};  
	printArray(test1);
	selection(test1);
	printArray(test1);

	                                                                                                                                                                                                    
        int[] test2 = new int[] {1,9,4,7,4,0};                                                                                                                                                              
        printArray(test2);                                                                                                                                                                                  
        insertion(test2);                                                                                                                                                                                   
        printArray(test2);                                                                                                                                                                                  
                                                                                                                                                                                                            
        test2 = new int[]  {1,9,4,7,4,0};                                                                                                                                                                   
        printArray(test2);                                                                                                                                                                                  
        selection(test2);                                                                                                                                                                                   
        printArray(test2); 
    }
}
