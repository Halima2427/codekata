import java.util.Scanner;
class leapyear
{
    public static void main(String args[])
    {
        Scanner sc4=new Scanner(System.in);
        System.out.println("Enter the year:");
        int year=sc4.nextInt();
        if((year%4==0 && year%100!=0)||(year%400==0))
        {
        System.out.println(year+" "+"is the leap year");
        }
        else
        {
        System.out.println(year+" "+"is not the leap year");
         }
    }
}