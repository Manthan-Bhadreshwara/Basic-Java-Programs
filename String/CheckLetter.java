//Display the numeber of inputed character in a statement 
import java.util.Scanner;
class CheckLetter
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement");
		String str = sc.nextLine();
		System.out.println("Enter a letter to be searched :");
		char ch = sc.next().charAt(0);
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				count++;
			}
		}
		System.out.println(ch+" has appearead "+count+" times");
	}
}