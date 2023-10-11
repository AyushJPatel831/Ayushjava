import java.util.Scanner;
public class Swap{
    public static void main(String[] args)
    {int c;
    Scanner ob1=new Scanner(System.in);
    int a= ob1.nextInt();
    int b= ob1.nextInt();
    System.out.println("Before Swapping:\n"+a+"\n"+b); 
    c=a;
    a=b;
    b=c;
     System.out.println("\nAfter Swapping:\n"+a+"\n"+b); 
    }
}