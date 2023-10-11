//WAP to swap the given integer and string array
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	int a[]={10,30,2,5,6,7};
	String s[]={"dog","rat","cat","mad"};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println(Arrays.toString(a));
	System.out.println(Arrays.toString(s));
	Arrays.sort(s);
	System.out.println(Arrays.toString(s));
	}
		
}