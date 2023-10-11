//WAP to create a string array and take input from user to fing given string array.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	String a[]={"Munna","Bhai","MBBS"};boolean g=true;
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		for(String i: a){
	    if(g=i.equals(s))
		break;
		}
	    System.out.println(g);
	}
	}