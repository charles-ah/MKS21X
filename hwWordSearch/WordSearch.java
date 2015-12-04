
import java.util.*;
import java.io.*;

public class WordSearch{
    private char[][]data;
    private ArrayList<String> wordsToAdd;
    private ArrayList<String> wordsAdded;
    public String solution;
    private Random randgen;
    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordSearch
     *@param col is the starting width of the WordSearch
     */
    public WordSearch(int rows,int cols,int randSeed)
    {
	randgen = new Random(randSeed);
	data = new char[rows][cols];
	clear();
    }

    /**Set all values in the WordSearch to spaces ' '*/
    private void clear()
    {
	for (int i = 0; i <data.length;i++)
            {
		for(int j = 0; j < data[i].length; j++)
                    {
			data[i][j] = ' ';
                    }
            }
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
    public String toString()
    {
	String ret = "";

	for (int i = 0;i<data.length;i++)
	    {
		for (int j = 0; j < data[i].length;j++)
		    {
			ret += data[i][j] + " ";
		    } 
		ret += "\n";
	    }

	return ret;
    }

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */
    /*
    public boolean addWordHorizontal(String word,int row, int col)
    {
	if (word.length() > data[row].length - col)
	    {
		return false;
	    }
	
	for (int i = 0; i< word.length();i++)
	    {
		if (!((word.substring(i)).equals(data[row][col + i])) && data[row][col + i] != ' ' )
		    {
			return false;
		    }
	    }
	
	for (int i = 0;i < word.length();i++)
            {
		data[row][col + i] = (char)word.charAt(i);
            }
	return true;
    }

    public boolean addWordVertically(String word,int row, int col)
    {
        if (word.length() > data.length - row)
            {
                return false;
            }

        for (int i = 0; i< word.length();i++)
            {
                if (!((word.substring(i)).equals(data[row+i][col])) && data[row+i][col] != ' ' )
                    {
                        return false;
                    }
            }

        for (int i = 0;i < word.length();i++)
            {
                data[row+i][col] = (char)word.charAt(i);
            }
        return true;
    }
    
    public boolean addWordDiagonally(String word,int row,int col)
    {
        if (word.length() > row || word.length() > data[0].length - col)
            {
                return false;
            }

        for (int i = 0; i< word.length();i++)
            {
                if (!((word.substring(i)).equals(data[row-i][col+i])) && data[row-i][col+i] != ' ' )
                    {
                        return false;
                    }
            }

        for (int i = 0;i < word.length();i++)
            {
                data[row-i][col+1] = (char)word.charAt(i);
            }
        return true;
    }
	
    */
    
   

    public void loadWords(String filename)
    {
	wordsToAdd = new ArrayList<String>();
	try{
	    Scanner text = new Scanner(new File (filename));
	    
	    while (text.hasNext())
		{
		    wordsToAdd.add(text.next());
		}

	}catch (FileNotFoundException e)
	    {
		System.out.println(e);
	    }

    }

    public void printWordList()
    {
	for(int i = 0;i < wordsToAdd.size();i++)
	    {
		System.out.println(wordsToAdd.get(i));
	    }
    }

    public void fillWithWords()
    {
	wordsAdded = new ArrayList<String>();
	for (int i = 0; i < wordsToAdd.size(); i++)
	    {
		while (!wordsAdded.contains(wordsToAdd.get(i)))
		    {
			//System.out.println(wordsToAdd.get(i));
			int randRow = randgen.nextInt(data.length);
			int randCol = randgen.nextInt(data[0].length);
			
			int dr = randgen.nextInt(2) - 1;
			int dc = randgen.nextInt(2) - 1;
			if(addWord(wordsToAdd.get(i),randRow,randCol,dr,dc))
			    {
				wordsAdded.add(wordsToAdd.get(i));
			    }
				
		    }
       	    }
	
	for (int i = 0; i < data.length;i++)
            {
                for(int j =0;j < data[i].length;j++)
                    {
                        if (data[i][j] == ' ')
                            {
                                data[i][j] = '-';
                            }
                    }
            }

	solution = toString();
	for (int i = 0; i < data.length;i++)
	    {
		for(int j =0;j < data[i].length;j++)
		    {
			if (data[i][j] == '-')
			    {
				data[i][j] = (char)(Math.random()*26 + 97);
			    }
		    }
	    }
    }

    private boolean addWord(String word, int row, int col, int dr, int dc)
    {
	if (dr == 0 && dc == 0)
	    {
		return false;
	    }
	
	if (Math.abs(word.length()*dr) > row)
	     {
		 return false;
	     }
	
	if (Math.abs(word.length()*dc) > col)
	    {
		return false;
	    }

	if (Math.abs(word.length()*dr) > data.length - row)
	     {
		 return false;
	     }
	
	if (Math.abs(word.length()*dc) > data[0].length -col)
	    {
		return false;
	    }

        for (int i = 0; i< word.length();i++)
            {
                if (!((word.substring(i)).equals(data[row-dr*i][col-dc*i])) && data[row-dr*i][col-dc*i] != ' ' )
                    {
                        return false;
                    }
            }

        for (int i = 0;i < word.length();i++)
            {
                data[row-dr*i][col-dc*i] = (char)word.charAt(i);
            }
        return true;
    }
	
 
    //vertical + diagonal should be implemented as well.

}
