public class SetGet{ 
    static int x;
    static int y;
    static int q;
    SetGet(int i,int j){ //setter
        x=i;
        y=j;
        q=x*y;
    }
    public static void get(){ //Getter
        System.out.println(q);
    }
    public static void main(String[] args) {
    SetGet obj=new SetGet(10,20);
        SetGet.get();
    }
}
