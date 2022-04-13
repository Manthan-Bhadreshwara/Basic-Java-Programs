import java.util.Scanner;
public class PrimeArray
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[20];
		int count=0;
		System.out.println("Enter 20 Numbers :");
		for(int i=0;i<20;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<20;i++)
		{
			int m=arr[i];
			for(int j=2;j<m;j++)
			{
				if((m%j)==0)
				{
					System.out.println(arr[i]+" not a Prime number ");
				}
				else	
					System.out.println(arr[i]+" Prime number ");
			}
		}
	}
}