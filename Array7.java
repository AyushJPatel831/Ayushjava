//WAP to find min and max of given array in minimum lines.
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	int a[]={10,30,2,5,6,7};
	System.out.println(Arrays.toString(a));
	Arrays.sort(a);
	System.out.println("Min= "+a[0]+"\nMax= "+a[a.length-1]);
	}	
}
