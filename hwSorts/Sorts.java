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


    public static void fillRandom(int[] nums)
    {
	for(int i =0;i<nums.length;i++)
	    {
		nums[i]=(int)(100*Math.random());
	    }
    }

    public static void swap(int[]nums,int pos1,int pos2)
    {
	int temp = nums[pos1];
	nums[pos1]=nums[pos2];
	nums[pos2]=temp;
    }
}
