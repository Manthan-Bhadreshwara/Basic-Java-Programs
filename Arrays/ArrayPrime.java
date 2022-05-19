import java.util.Scanner;
public class ArrayPrime
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();    
        int arr[]=new int[n];
        int count=0;
        
        System.out.println("Enter the numbers :");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<=arr[i];j++)
            {
                if((arr[i]%j) == 0)
                {
                    count++;
                }
            }
            if(count==2)
            {
                System.out.println(arr[i]+" is a Prime number.");
            }
            else
            {
                System.out.println(arr[i]+" is not a Prime number");
            }
            count=0; 
        }
    }
}
