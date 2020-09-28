import java.util.Scanner;

public class ConstructionTester
{
    public static void main(String[] args)
    {
        //Attributes
        Scanner in = new Scanner(System.in);
        double lumberCost = 8.0;
        double windowCost = 11.0;
        double taxRate;
        int boards, windows;
        double total, grandTotal;

        //Taking input
        System.out.println("Enter the sales tax rate: ");
        taxRate = in.nextDouble();
        System.out.println("How many boards do you need?");
        boards = in.nextInt();
        System.out.println("How many windows do you need?");
        windows = in.nextInt();

        // Printing the outputs.
        Construction myC = new Construction(8, 11, taxRate);
        total = myC.lumberCost(boards) + myC.windowCost(windows);
        System.out.println("Total: " + total);
        grandTotal = myC.grandTotal(total);
        System.out.print("Grand Total: " + grandTotal);
    }
}
