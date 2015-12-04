public class Driver
{

    public static void main(String[]args)
    {
	//	int seed = (int)(Math.random()*100000);
	WordSearch WordGrid = new WordSearch(Integer.parseInt(args[0]),Integer.parseInt(args[1]),Integer.parseInt(args[2]));
	

	WordGrid.loadWords("Words.txt");
	WordGrid.printWordList();
	WordGrid.fillWithWords();
	System.out.println(WordGrid.solution);
	System.out.println(WordGrid.toString());
    }
}
