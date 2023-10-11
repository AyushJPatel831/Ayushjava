public class Class{ 
    static int x,y;
    Class(int i,int j){ //setter
        x=i;y=j;
    }
    public static void get(){ //Getter
        System.out.println(x+y);
    }
    public static void main(String[] args) {
        Class obj=new Class(100,45);
        Class.get();
    }
}
