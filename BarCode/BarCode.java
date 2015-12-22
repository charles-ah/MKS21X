public class BarCode implements Comparable{
// instance variables
   private String _zip;
   private int _checkDigit;

// constructors
//precondtion: zip.length() = 5 and zip contains only digits.
//postcondition: throws a runtime exception zip is not the correct length
//               or zip contains a non digit
//               _zip and _checkDigit are initialized.
    public BarCode(String zip) 
    {
	if(zip.length() != 5)
	    {
		throw new IllegalArgumentException("not a valid zip");
	    }

	try{
		  int sum = 0;
		   for(int i = 0;i < 5;i++)
		       {
			   sum += Integer.parseInt(zip.substring(i,i+1));
		       }
		   _zip = zip; 
		   _checkDigit = sum%10;
	    }
	catch(Exception e)
	    {System.out.println(e);}
    }

// postcondition: Creates a copy of a bar code.
public BarCode(BarCode x)
    {
	_zip = (x.toString()).substring(0,6);
	_checkDigit =(int) (x.toString()).charAt(6);
	   
    }


//post: computes and returns the check sum for _zip
private int checkSum()
    {
	int sum = 0;
	for(int i = 0;i < 5;i++)                                                                                                                                                                 
	    {                                                                                                                                                                                    
		sum += Integer.parseInt(_zip.substring(i));                                                                                                                                       
	    }
	return sum;
    }

//postcondition: format zip + check digit + barcode 
//ex. "084518  |||:::|::|::|::|:|:|::::|||::|:|"      
public String toString()
    {
	System.out.println(_zip);
	String bar = "|";
	String[] bartrans = {"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::"};
	for(int i = 0;i < 5;i++)
	    {
		System.out.println(Integer.parseInt(_zip.substring(i,i+1)));
		bar += bartrans[Integer.parseInt(_zip.substring(i,i+1))];
	    }
	System.out.println(_checkDigit);
	bar += bartrans[_checkDigit]+"|";
	return _zip+"\t"+bar;
    }


public boolean equals(Object other)
    {
	if(!(other instanceof BarCode))
	    {
		return false;
	    }
	return toString().equals(other.toString());
	 

    }
// postcondition: false if the object is not a BarCode, 
// false if it is a non-matching barcode
// true when they match.


public int compareTo(Object other)
    {
	return Integer.parseInt(_zip) + (_checkDigit) - Integer.parseInt((other.toString()).substring(0,6))+(int)(other.toString()).charAt(6);
    }
// postcondition: compares the zip + checkdigit 

}
