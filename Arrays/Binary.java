import java.util.Scanner;
public class Binary
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int lb=0,ub=arr.length-1,mid,flag=0;
		System.out.println("Enter 10 elements :");
		for(int i=0;i<10;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter element to be searched :");
		int n=sc.nextInt();
		while(lb<=ub)
		{
			mid=(lb+ub)/2;
			if(arr[mid]==n)
			{
				System.out.println("Element found at position "+mid);
				flag=1;
				break;
			}
			else if(arr[mid]>n)
			{
				ub=mid-1;
			}
			else
			{
				lb=mid+1;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found ");
		}
	}
}