package Interest;
import java.util.*;
public class Cost_Demo 
{
public static void main(String args[])
{
	HouseCost hc=new HouseCost();
	Scanner sc=new Scanner(System.in);
	double area;
	String standard;
	System.out.println("Enter the standard:");
	standard=sc.next();
	System.out.println("Enter area of house:");
	area=sc.nextDouble();
	sc.close();
	System.out.println("Total Cost for construction of house if we use "+standard+" material is:");
	hc.houseCost(standard,area);
	System.out.println(hc.totalcost);
	
}
}
