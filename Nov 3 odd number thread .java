
class A{
    public void series(int n1,int n2,int n){
        for(int i=n1;i<=n2;i++){
            if(n==0){
                if(i%2==0){
                    System.out.println(i+" ");
                }
            }
            else{
                if(i%2!=0){
                    System.out.println(i+" ");
                }
            }
        }
    }
}

class B extends Thread{
    public void run(){
        A a =new A();
        a.series(1,50,0);
    }
}

class C extends Thread{
    public void run(){
        A a =new A();
        a.series(1,50,1);
    }
}
public class Main
{
	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		b.start();
		c.start();
	}
}
