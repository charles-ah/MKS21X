import java.util.Scanner;

public class Game
{
    public static void main(String[] args)
    {
	Actor A;
	String message,result;
	message = "Choose a class: Teacher, Nerd, Bully [T/N/B]";
	Scanner input = new Scanner(System.in);
	
        do{
            System.out.print(message);
            result = input.next();
            message = " Choose a valid input [T/N/B]";
        }while(result.equals("T") || result.equals("N") || result.equals("B"));

        //result is always W or B, so if/else is ok
        if(result.equals("T")){
            A = new Teacher();
        }
         
        if(result.equals("N"))
	    {
		A = new Nerd();
	    }

	if(result.equals("B"))
	    {
		A = new Bully();
	    }

	Actor opponent = new Teacher();
	//	if (result.equals("T") || result.equals("N") || result.equals("B"))
	// {
	System.out.println("Combat Start!");

	do{
	message = "Make your move: [Attack/SpecialAttack/Defend/Quit]";
	//	Scanner input = new Scanner(System.in);
	do{
	    System.out.print(message);
            result = input.next();
            message = " Choose a valid input: [Attack/SpecialAttack/Defend/Quit]";
        }while(result.equals("Attack") || result.equals("SpecialAttack") || result.equals("Defend") || result.equals("Quit"));

	if (result.equals("Attack"))
	    {
		System.out.println(A.attack());
		System.out.println(opponent.attack());
	    }

	if (result.equals("SpecialAttack"))
            {
		System.out.println(A.specialAttack());
		System.out.println(opponent.specialAttack());
            }

	if (result.equals("Defend"))
            {
		System.out.println(A.defend());
		System.out.println(opponent.defend());
            }

	if (result.equals("Quit"))
            {
		System.out.println("Combat is over");
            }
	}
	while (A.getHP() > 0 || result.equals("Quit"));
    
	//  }
	    }


}