public class ArrayMethods{
    public static int max(int[][] AR)
    {
        int tempmax = 0;
        for (int i = 0;i < AR.length;i++)
            {
                for (int j=0;j< AR[i].length;j++)
                    {
                        tempmax = Math.max(tempmax, AR[i][j]);
                    }
            }
        return tempmax;
    }

    //returns the maximum value in the 2d parameter array AR.                                                                                                                                               

    public static int rowSum(int[][] AR, int x)
    {
	int sum  = 0;
	for(int i = 0;i<AR[x].length;i++)
	    {
		sum += AR[x][i];
	    }
	return sum;
    }

    //returns the sum of the elements in Row x of AR.                                                                                                                                                       

    public static int columnSum(int[][] AR, int x)
    {
        int sum = 0;
        for(int i = 0;i < AR.length;i++)
	    {
		sum += AR[i][x];
	    }
        return sum;
    }

    //returns the sum of the elements in Column x of AR (careful with rows of different lengths!).                                                                                                          

    public static int[] allRowSums(int[][] AR)
    {
        int[] sum = new int[AR.length];
        for (int i = 0;i < sum.length;i++)
	    {
		sum[i] = rowSum(AR,i);
	    }
        return sum;
    }

    //calculates the row sum for every row and returns each of the values in an array.                                                                                                                      
    //Index i of the return array contains the sum of elements in row i.                                                                                                                                    

    public static boolean isRowMagic(int[][] AR)
    {
        boolean magic = true;
        for(int i = 0; i < AR.length - 1;i++)
	    {
		if (allRowSums(AR)[i] != allRowSums(AR)[i+1])
		    {
			magic = false;
		    }
	    }
        return magic;
    }
    //checks if the array is row-magic (this means that every row has the same row sum).                                                                                                                    

    public static boolean isColumnMagic(int[][] AR)
    {
        boolean magic = true;
        for(int i = 0; i < AR[0].length - 1;i++)
	    {
		if (columnSum(AR,i) != columnSum(AR,i+1))
		    {
			magic = false;
		    }
	    }
        return magic;
    }
    //checks if the array is column-magic (this means that every column has the same column sum).                                                                                                           

    public static boolean isSquare(int[][] AR)
    {
        return AR.length == AR[0].length;
    }
    //checks if the array is square (i.e. every row has the same length as AR itself).                                                                                                                      
}
