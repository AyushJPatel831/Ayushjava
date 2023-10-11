import java.util.*;
public class Reverse {

    public static void main(String[] args) {

    int b=1,c=0;
        Scanner ab=new Scanner(System.in);
      int a=ab.nextInt();  
      while(a>0)
      {b=a%10;
      c=c*10+b;
      a/=10;
      } System.out.println("Reverse="+c);
    }
}