import java.util.Scanner; 
class vowcons
{
    public static void main(String args[])
    {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Enter the character u have to check:");
        char data = sc1.next().charAt(0);
        if(data=='a'||data=='e'||data=='o'||data=='i'||data=='u')
        {
            System.out.println(data+" "+"is the Character entered is  a vowel");
        }
        else
        {
            System.out.println(data+" "+"is the Character entered is  a consonant");

        }
    }
}