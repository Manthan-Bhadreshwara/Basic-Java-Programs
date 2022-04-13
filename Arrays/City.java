//array cities and array std code
import java.util.Scanner;
public class City
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		String c[]={"MUMBAI","DELHI","CHENNAI","KOLKATA","COCHI"};
		int std[]={2,3,42,92,12};
		
		System.out.println("Cities are :");
		for(int i=0;i<5;i++)
		{
			System.out.println(c[i]+" ");
		}
		System.out.println("Enter a cities name :");
		String str=sc.next();
		str=str.toUpperCase();
		System.out.println("Std code of the given city is :");
		for(int i=0;i<5;i++)
		{
			if(str.compareToIgnoreCase(c[i])==0)
			{
				System.out.println(std[i]);
			}
		}
	}
}