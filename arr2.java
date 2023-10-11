//WAP to initialise the array and display it.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++)
		{
		    System.out.println("Enter No.: ");
		    a[i]=sc.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
		    System.out.println(a[i]);
		}
	}
}