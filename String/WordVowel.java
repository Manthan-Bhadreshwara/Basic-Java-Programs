//To count the number of vowels in the words of the entered statement
import java.util.Scanner;
public class WordVowel
{
	public static void main(String arg[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a statement");
		String str=sc.nextLine();
		String temp="";
		str=str+" ";
		int count=0;
		System.out.println("\nWord \t No. of Vowels");
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp=temp+str.charAt(i);
			}
			else
			{
				for(int j=0;j<temp.length();j++)
				{
					char ch = temp.charAt(j);
					if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
					{
						count++;
					}
					
				}	
				System.out.println(temp+"\t"+count);
				temp="";
				count=0;
			}
		}
	}
}

		
