import java.util.Scanner;
class palindrome
{
    public static void main (String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number to check palindrom:");
    int num=sc.nextInt();
       int temp=num ,rev=0;
       int rem;
       
      while( num != 0 )
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num =num/10;
        }
      if(temp==rev)
      {
          System.out.println("THe number u entered is palindrome");
      }
      else
      {
        System.out.println("THe number u entered is not");
   
      }
    }
}