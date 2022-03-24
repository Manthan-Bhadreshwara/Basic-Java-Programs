import java.util.Scanner;

public class Product
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of goods");
        int n = sc.nextInt();
        String pro[]=new String[n];
        double pri[]=new double[n];
        double qty[]=new double[n];
        double tot[]=new double[n];
        double sum=0;
        System.out.println("Enter Product Name,Price,Quantity :");
        for(int i=0;i<n;i++)
        {
            pro[i]=sc.next();
            pri[i]=sc.nextDouble();
            qty[i]=sc.nextDouble();
        }
        System.out.println("Product Name\tPrice\tQuantity\tTotal");
        for(int i=0;i<n;i++)
        {
            tot[i]=pri[i]*qty[i];
            sum=sum+tot[i];
            System.out.println(pro[i]+"\t\t"+pri[i]+"\t"+qty[i]+"\t\t"+tot[i]);
        }
        System.out.println("Total amount Payable :\t\t\t"+sum);
    }
}
