import java.util.Scanner;
public class CaseChange
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name :");
		String str=sc.nextLine();
    
		str=str.toUpperCase();
		String temp="";
		for(int i=str.length()-1;i>=0;i--)
		{
			temp+=(char)(str.charAt(i)-32); //Converting to lower case without using library Functions
		}
		System.out.println(temp);
    
    
    System.out.println(str.toLowerCase()); //Converting to lower case using library Functions in 1 step
	}
}
