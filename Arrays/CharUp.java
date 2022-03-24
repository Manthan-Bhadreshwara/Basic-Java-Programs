/*
Write a program to define a function void convert(String text). 
Convert the argument 'text into uppercase form. Modify the string by moving 2 characters ahead. 
Print the input and modified strings.
*/
import java.util.Scanner;
public class CharUp
{
    public static void convert(String str)
    {
        String temp="";
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            if(ch==' ')
            {
                temp+=' ';
            }
            else
            {
                if(ch=='Z')
                {
                    ch='B';
                }
                else if(ch=='Y')
                {
                    ch='A';
                }
                else
                {
                    ch+=2;
                }
            }
            temp=temp+ch;
        }
        System.out.println("Original String  :"+str);
        System.out.println("Changed String :"+temp);
    }
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a statement :");
        String str = sc.nextLine();
        charUp obj = new charUp();
        obj.convert(str);
    }
}
