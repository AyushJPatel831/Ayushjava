//WAP to calculate the sum and average of all value store in the integer array.
public class Main
{
	public static void main(String[] args) {
	int a[]={40,45,2,3,78,45};
		int s=0;
		for(int i: a){
		s+=i;
		}
	double	b=s/a.length;
		System.out.println("Sum is: "+s+"\nAverage is: "+b);}
	}