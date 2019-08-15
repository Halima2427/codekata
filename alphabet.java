
import java.util.Scanner;

class alphabet
{
    public static void main(String args[])
    {
    Scanner sc2=new Scanner(System.in);
    System.out.println("Enter the value you want to check:");
    char data=sc2.next().charAt(0);
    if((data>='a' && data<='z')||(data>='A' && data<='Z'))
    {
    System.out.println("The value you entered"+" "+data+" "+"is an alphabet");
    }
    else
    {
    System.out.println("The value you entered"+" "+data+" "+"is not an alphabet");
    }
}
}