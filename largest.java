import java.util.Scanner;
class largest
{
    public static void main(String args[])
    {
        Scanner sc3=new Scanner(System.in);
        System.out.println("Enter the first number :");
        int data1=sc3.nextInt();
        System.out.println("Enter the second number :");
        int data2=sc3.nextInt();
        System.out.println("Enter the third number :");
        int data3=sc3.nextInt();
        if(data1>data2 && data1>data3)
        {
        System.out.println(data1+" "+" is the largest among others");
        }
        else if(data2>data1 && data2>data3)
        {  
         System.out.println(data2+" "+" is the largest among others");
        }
        else if(data3>data1 && data3>data2) 
        {
        System.out.println(data3+" "+" is the largest among others");

        }

    }
}