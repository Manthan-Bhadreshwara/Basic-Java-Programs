//Program to print Sum of Numbers at even and odd index
import java.util.*;
public class SumIndex
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int sum=0,sumein=0;
		System.out.println("Enter "+n+"Elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];	
			if(i%2==0)
			{
				sumein=sumein+arr[i];
			}
		}
		System.out.println("Sum of Numbers :"+sum);
		System.out.println("Sum of numbers at even index:"+sumein);
		System.out.println("Sum of numbers at odd index :"+(sum-sumein));
	}
}
