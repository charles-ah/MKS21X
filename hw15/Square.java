public class Square extends Rectangle
{

    public Square(){super();}

    public Square(double s){super(s,s);}
    
    public void setWidth(double s){super.setWidth(s);super.setLength(s);}

    public void setLength(double s){super.setWidth(s);super.setLength(s);}

    public String toString(){return "A Square with side="+getWidth()+", which is a subclass of "+super.toString();} 
}