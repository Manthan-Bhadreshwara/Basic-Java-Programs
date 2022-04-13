import java.util.Scanner;
public class TP
{
	
	public static void main(String arg[])
	{
		int j,e;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		e=sc.nextInt();
		for(j=1;j<=e;j++)
		{
			System.out.print(j+" ");
		}
		System.out.println();
		Conti cs = new Conti();	
		cs.loo();
	}
	void loop()
	{
		int i,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of times the loop is to be repeated");
        		c = sc.nextInt();
       		for(i=1;i<=c;i++)
        		{
            			System.out.println(i);
        		}
	}	
}
