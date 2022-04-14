/*
 * eg : Input  : Hey there, woah
 *      Output : yeH ,ereht hoaw
 */
import java.util.Scanner;
public class RevEachWordOfSentance
{
    public static String wht(String rev)
    {
        String temp="";
        for(int i=rev.length()-1;i>=0;i--)
        {
            temp=temp+rev.charAt(i);
        }
        return temp;
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        RevEachWord obj = new RevEachWord();
        System.out.println("Enter a statement :");
        String str=sc.nextLine();
        str=str+" ";
        String temp="",wr="",rev="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            {
                rev=rev+str.charAt(i);
            }
            else
            {
                wr=obj.wht(rev);
                temp=temp+" "+wr;
                rev="";
            }
        }
        System.out.println("Statement after reversing each word :"+temp.trim());
    }
}
