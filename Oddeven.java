import java.util.Scanner;
public class Data{
    public static void main(String[] args)
    {
    Scanner ob1=new Scanner(System.in);
    int a= ob1.nextInt();
    if(a%2==0)
    System.out.println("\n"+a+" is even");
   else
     System.out.println("\n"+a+" is odd"); 
    }
}