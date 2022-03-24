//Program to calcutate the sum and average of elements in an array
import java.util.*;
public class ArraySumAvg
{
	public static void main(String arg[])	
	{
		int sum=0,i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter "+n+" elements of the array ");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		System.out.println("Sum : "+sum);
		double avg = (double)sum/n;
		System.out.println("Average : "+avg);
	}
}
