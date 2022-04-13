import java.util.Scanner;
public class Nu
{
	public static void main(String arg[])
	{
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2digit no.");
		n=sc.nextInt();

		int t=n%10;
		
		switch(t)
		{
			case 1 : System.out.println("One");
			break;

			case 2 : System.out.println("Two");
			break;
		
			case 3 : System.out.println("three");
			break;
			
			case 4  : System.out.println("four");
			break;
		}
	}
}