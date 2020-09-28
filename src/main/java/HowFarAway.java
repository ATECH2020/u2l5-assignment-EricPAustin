import java.util.Scanner;

public class HowFarAway 
{
    public static void main(String[] args)
    {
        //Attributes
        Scanner in = new Scanner(System.in);
        double firstLat, firstLon, secondLat, secondLon;

        //Input from user and object creation
        System.out.print("Enter the latitude of the starting location: ");
        firstLat = in.nextDouble();
        System.out.print("Enter the longitude of the starting location: ");
        firstLon = in.nextDouble();
        System.out.print("Enter the latitude of the ending location: ");
        secondLat = in.nextDouble();
        System.out.print("Enter the longitude of the ending location: ");
        secondLon = in.nextDouble();
        GeoLocation g1 = new GeoLocation(firstLat, firstLon);
        GeoLocation g2 = new GeoLocation(secondLat, secondLon);

        //Printing out the distanceS
        System.out.print("The distance is " + g1.distanceFrom(g2) + " miles.");
    }
}