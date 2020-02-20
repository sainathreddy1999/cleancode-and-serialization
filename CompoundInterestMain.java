package Interest;
import java.util.*;
public class CompoundInterestMain 
{
	public static void main(String args[])
	{
		double p,r;
		int t,n;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Principle Amount:");
		p=s.nextDouble();
		System.out.println("Enter time in terms of Months:");
		t=s.nextInt();
	    System.out.println("Enter interest:");
		r=s.nextDouble();
		System.out.println("Enter number of times Interest should be compounded:");
		n=s.nextInt();
		CompoundInterest ci=new CompoundInterest(p,t,r,n);
		System.out.println("Compound interest with principle amount "+p+" for the time of "+t+" months with interest "+r+" is:");
		System.out.println(ci.c_interest);
		s.close();
    }
}
