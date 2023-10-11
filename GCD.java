import java.util.*;
public class GCD {

    public static void main(String[] args) {

int r=1;
        Scanner ab=new Scanner(System.in);
      int a=ab.nextInt();  
      int b=ab.nextInt();
      for(int i=1;i<=a && i<=b;i++)
      {if(a%i==0 && b%i==0)
      r=i;
        
      } System.out.println("GCD="+r);
    }
}