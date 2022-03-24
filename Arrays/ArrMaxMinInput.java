//Program to find the largest and smallest element in the array
import java.util.Scanner;
public class ArrMaxMinInput
{
	public static void main(String arg[])	
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		int len=arr.length;
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
                int max=arr[0];
		int min=arr[0];
		
		for(i=0;i<len;i++)
		{
			if(max<arr[i])
			{
				max=arr[i];
			}

			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
	
		System.out.println("Largest Element : "+ max);
		
		System.out.println("Smallest Element : "+min);
	}
}
