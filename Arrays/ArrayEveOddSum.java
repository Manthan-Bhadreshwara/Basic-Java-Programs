//Program to calculate the sum of even and odd numbers in an Array
import java.util.*;
public class ArrayEveOddSum
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array :");
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		int sum=0,sumev=0,sumod=0;
		System.out.println("Enter "+n+"Elements :");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
			if(arr[i]%2==0)
			{
				sumev=sumev+arr[i];
			}
		}
		System.out.println("Sum of Numbers :"+sum);	
		System.out.println("Sum of even numbers :"+sumev);
		System.out.println("Sum of odd number :"+(sum-sumev));
		
	}
}
