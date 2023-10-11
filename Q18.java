import java.util.*;
public class Area {
static int l;
static int w;
static int a=1;
public static void set(int i,int j)
{
    l=i;
    w=j;
    a=l*w;
}
public static void area()
{
   System.out.println("Area="+a);
}
    public static void main(String[] args) {
        Scanner ab=new Scanner(System.in);
      int x=ab.nextInt();
      int y=ab.nextInt();
       Area.set(x,y);
      Area.area();
     
    }
}