import java.util.Scanner;

public class VOWELConstant
{
    public static void main(String args[])
    {
        char ch;
        Scanner scan = new Scanner(System.in);
		
        System.out.print("Enter an Alphabet : ");
        ch = scan.next().charAt(0);
		
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' ||
        ch=='i' || ch=='I' || ch=='o' || ch=='O' ||
        ch=='u' || ch=='U'|| ch=='$')
        {
            System.out.print("This is a Vowel");
        }
        else
        {
            System.out.print("This is consonant");
        }
    }
}