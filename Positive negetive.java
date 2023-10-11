import java.util.*;
public class Alpha {

    public static void main(String[] args) {

    
        Scanner ab=new Scanner(System.in);
      int n=ab.nextInt();
      if(n>0)
      System.out.println(n+" is positive.");
      else if(n==0)
      System.out.println(n+" is neither positive nor negetive.");
      else
      System.out.println(n+" is negetive.");
    }
}