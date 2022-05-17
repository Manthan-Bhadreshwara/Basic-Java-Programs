/*Toggle case?
  Input : Hello worlD	
  Output : hELLO WORLd
  
  */
import java.util.Scanner;
class Toggle
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		String str, ans="";
		int i;
		System.out.println("Enter string ");
		str=sc.nextLine();

		for(i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(ch>='a' && ch<='z')
			{
				ch-=32;
			}
			else if(ch>='A' && ch<='Z')
			{
				ch+=32;
			}
			ans=ans+ch;
		}
		System.out.println(ans);
	}
}
