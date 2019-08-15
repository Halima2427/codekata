import java.util.Scanner; 
class oddeven1
{
    public static void main(String args[])
    {
        Scanner check = new Scanner(System.in);
        System.out.println("Enter the Number");
        int data = check.nextInt();
       
        if(data%2==0)
        {
            System.out.println(+data+" "+"is a even number");
        }
        else
        {
          System.out.println(+data+" "+"is a odd number");

        }
    }
}