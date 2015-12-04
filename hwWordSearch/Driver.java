public class Driver
{

    public static void main(String[]args)
    {
	if (args.length < 3)
	    {
		System.out.println("\n\nFatal: input must have form of:\n\n\t java Driver [row] [col] [seed]\n\n");
		return;
	    }
	
	int seed = Integer.parseInt(args[2]);
	//	int seed = (int)(Math.random()*100000);
	WordSearch WordGrid = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),seed);
	

	WordGrid.loadWords("Words.txt");
	WordGrid.printWordList();
	WordGrid.fillWithWords();
	if (args.length == 4)
	    {
		if (Integer.parseInt(args[3]) == 1)
		    {
			System.out.println(WordGrid.solution);
		    }
	    }

	System.out.println(WordGrid.toString());
    }
}
