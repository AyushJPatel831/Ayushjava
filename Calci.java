 class Calci
{
    private int i;
    private int j;
    Calci(int x,int y)
    {
        i=x;
        j=y;
    }
    public void add()
    {System.out.println("ADD:");
        System.out.println(i+j);
    }
    public void sub()
    {System.out.println("\nSUB: ");
        System.out.println(i-j);
    }
    public void pro()
    {System.out.println("PRODUCT: ");
        System.out.println("\n"+i*j);
    }
}
class A{
    public static void main(String[] args)
    {
        Calci c=new Calci(3,8);
        c.add();
        c.sub();
        c.pro();
    }
}