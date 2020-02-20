package Interest;
import java.util.*;
public class  SimpleInterestMain 
{
public static void main(String args[])
{
	double p,r;
	int y;
	Scanner s=new Scanner(System.in);
	System.out.println("Enter Principle Amount:");
	p=s.nextDouble();
	System.out.println("Enter time in terms of Months:");
	y=s.nextInt();
    System.out.println("Enter interest:");
	r=s.nextDouble();
	SimpleInterest si=new SimpleInterest(p,y,r);
	System.out.println("Simple Interest with principle amount "+p+" for the time of "+y+" months with interest "+r+" is:");
	System.out.println(si.s_interest);
	s.close();

	}

}