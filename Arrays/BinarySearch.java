//Program to implement Binary Search algorithm
import java.util.*;
public class BinarySearch
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int n, lb, ub, mid, val, i;
		System.out.println("Enter how many elements ");
		n=sc.nextInt();

		int arr[]=new int[n];
		lb=0;
		ub=n-1;

		System.out.println("Enter elements ");
		for(i=0; i<n; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter elements to be search ");
		val=sc.nextInt();
		while(lb<=ub)
		{
			mid=(ub+lb)/2;

			if(arr[mid]<val)
			{
				lb=mid+1;
			}
			else if(arr[mid]>val)
			{
				ub=mid-1;
			}
			else if(arr[mid]==val)
			{
				System.out.println(val + " found in array at position " + (mid+1));
				break;
			}
		}
		if(lb>ub)
			System.out.println(val + " Not found in array");
	}
} 
