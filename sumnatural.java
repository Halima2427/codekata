import java.util.Scanner;
class sumnatural
{
    public static void main(String args[])
    {
        Scanner sc6=new Scanner(System.in);
        System.out.println("Enter the natural number you want to sum:");
        int data=sc6.nextInt();
        int sum=0;
        for(int i=0; i<data; i++)
        {
            
            sum=sum+i;
        }
        System.out.println("Sum of"+" "+data+" Natural numbers is:"+ sum);

    }
}