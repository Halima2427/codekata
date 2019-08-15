import java.util.Scanner; 
class define
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        if(number>=0)
        {
            System.out.println(number+"is a Positive number");
        }
        else
        {
          System.out.println(number+"is a Negative number");

        }
    }
}