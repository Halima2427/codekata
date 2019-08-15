import java.util.Scanner;
class digits
{
    public static void main(String args[])
    {
        Scanner sc5=new Scanner(System.in);
        int digit=sc5.nextInt();
        int i=0;
        for(;digit!=0; digit/=10,++i)
        {
            System.out.println("number of digits:"+i);
        }

    }
}