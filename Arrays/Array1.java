//program to create an array,take input from the user and print the elements of the Array
import java.util.Scanner;
public class Array1
{
	public static void main(String arg[])	
	{
		int i,n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many elements");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		System.out.println("Enter elements");
		for(i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Elements in array");	
		for(i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
	}
}
