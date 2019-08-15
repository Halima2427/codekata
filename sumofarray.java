import java.util.Scanner;
class sumofarray
{
    public static void main(String args[])
    {
        int Sum=0;
        Scanner sc7=new Scanner(System.in);
        System.out.println("Enter the no of element in an array:");
        int k=sc7.nextInt(); 
        
        int [] a = new int[k];
        
        System.out.print(" Please Enter the size  elements of an Array  : "+k);
		for (int i = 0; i < k; i++)
		{
			a[i] = sc7.nextInt();
		}   

		for(int i = 0; i < k; i++)
		{
			Sum = Sum + a[i]; 
		}		
		System.out.println("\n The Sum of All Elements in this Array = " + Sum);
    }
}