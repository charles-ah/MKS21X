public class Driver
{
    public static void main(String[] args){
    Coordinate Coord1 = new Coordinate(1.0,2.0);
    System.out.println(Coord1.toString());
    Coord1.setX(3);
    Coord1.setY(4);
    System.out.println(Coord1.toString());
    System.out.println(Coord1.distToOrigin());

    Coordinate Coord2 = new Coordinate(0.0,1.0);
    System.out.println(Coord1.dist(Coord2));
}
}
