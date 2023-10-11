//WAP to count the even number and odd number present in integer array.
public class Main{
    public static void main(String[] args){
    int a[]={1,2,3,4,5,6,7,8,9,10};
    int k=0;
    for(int i:a)
    {
        if(i%2==0)
        k++;
    }
    int m=a.length-k;
    System.out.println("Total even: "+k+"\nTotal odd: "+m);
    }
}