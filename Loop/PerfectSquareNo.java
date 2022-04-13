import java.util.Scanner;
public class PerfectSquareNo
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 20 numbers :");	
		int arr[]=new int[20];
		
		for(int i=0;i<20;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<20;i++)
		{
			double d = Math.sqrt(arr[i]);
			if((d-Math.floor(d))==0)
			{
				System.out.println(arr[i]+"is a perfect square no.");
			}
		}
		
	}
}		
