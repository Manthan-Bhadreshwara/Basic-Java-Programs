import java.util.Scanner;
public class LinearSearch
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,val;
		System.out.println("Enter the number of elements to be entered");
		n=sc.nextInt();
		int arr[]=new int [n];

		System.out.println("Enter the elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter elemnt to be searched : ");
		val=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(arr[i]==val)
			{
				System.out.println(val+" Found in array at position " +(i+1));
			}
		}
	}
}
