import java.util.Scanner; 
class oddeven
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
       
        if(number%2==0)
        {
            System.out.println(+number+" "+"is a even number");
        }
        else
        {
          System.out.println(+number+" "+"is a odd number");

        }
    }
}