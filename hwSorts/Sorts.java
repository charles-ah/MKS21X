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
    
    public static void insertionSort(int[] data) {                                                                                                                                                         
        for (int i = 0; i < data.length; i++) {                                                                                                                                                            
            for (int j = 0; j < data.length - 1; j++) {                                                                                                                                                    
                if(data[j] >= data[j + 1]) {                                                                                                                                                               
                    int temp = data[j];                                                                                                                                                                       
                    data[j] = data[j + 1];                                                                                                                                                                 
                    data[j + 1] = temp;                                                                                                                                                                       
                }                                                                                                                                                                                          
            }                                                                                                                                                                                              
        }                                                                                                                                                                                                  
    }

    public static void selectionSort(int nums[])
    {
	int count = 0;
	int temp;
	while(count<nums.length)
	    {
		int x = min(Arrays.copyOfRange(nums,count,nums.length));
		int index = count+indexOf(Arrays.copyOfRange(nums,count,nums.length),x);
		
		temp = nums[count];
		nums[count] = x;
		nums[index] = temp;
		count++;
	    }
    }

    public static void bubbleSort(int nums[])
    {
	/*
	for(int i = 0;i<nums.length-1;i++)
	    {
		if(nums[i]<nums[i+1])
		    {
			int temp = nums[i];
			nums[i] = nums[i+1];
			nums[i+1] = temp;
		    }
	    }
	*/
	for(int i = 0;i<nums.length-1;i++)                                                                                                                                                                            {
	    for(int j = 0;j<nums.length-i-1;j++)
		{
		    if(nums[j]>nums[j+1])                                                                                                                                                                   
			{
			    int temp = nums[j];                                                                                                                                                                
			    nums[j] = nums[j+1];                                                                                                                                                          
			    nums[j+1] = temp;                                                                                                                                                           
                    }                                                                                                                                                                                      
            } 
	}
	/*
	for(int i = 0;i<nums.length;i++)
	    {
		for(int j = 0;j < i;j++)
		    {
			if (nums[nums.length-1-j] < nums[nums.length-j-2])
			    {
				int temp = nums[nums.length-j-1];
				nums[nums.length-j-1]=nums[nums.length-j-2];
				nums[nums.length-j-2]=temp;
			    }
		    
		    }
	    }
	*/
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
	int[] test1 = new int[] {87,65,51,80,6,74,2,64,15,78,20,37,8,61,95,45,92,9,17,15,61,93,68,81,76,86,34,84,93,16,77,27,59,77,83,34,77,1,65,11,1,78,44,94,24,6,91,71,14,74,26,44,52,12,26,75,11,72,75,49,89,4,24,83,71,20,13,63,46,73,97,85,67,69,0,83,53,50,77,44,86,40,51,49,53,99,16,19,6,87,44,32,95,45,78,41,39,97,5,35};
	/*
	for(int i = 0;i <100;i++)
	    {
		test1[i] = (int)(100*Math.random());
	    }
	*/

	printArray(test1);
	bubbleSort(test1);
	printArray(test1);
	

//	test1 = new int[]  {1,9,4,6,8,0};  
	/*
	printArray(test1);
	selection(test1);
	printArray(test1);
	*/

	/*
        int[] test2 = new int[] {1,9,4,7,4,0};                                                                                                                                                              
        printArray(test2);                                                                                                                                                                                  
        insertion(test2);                                                                                                                                                                                   
        printArray(test2);                                                                                                                                                                                  
                                                                                                                                                                                                            
        test2 = new int[]  {1,9,4,7,4,0};                                                                                                                                                                   
        printArray(test2);                                                                                                                                                                                  
        selection(test2);                                                                                                                                                                                   
        printArray(test2);
	*/
    }
}
