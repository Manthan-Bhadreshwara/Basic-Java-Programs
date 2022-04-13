import java.util.Scanner;
public class Menu
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int i;
		for(i=3;i<=n;i+=2)
		{
			System.out.print(","+i);
		}
	}
}