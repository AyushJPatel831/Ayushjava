import java.util.*;
public class Factorial {

    public static void main(String[] args) {


        Scanner ab=new Scanner(System.in);
      int n=ab.nextInt();    int s=1,i;
      for( i=1;i<=n;i++)
      {
          s=s*i;
      }System.out.println("Factorial="+s);
    }
}