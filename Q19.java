
import java.util.*;
public class Light{
    boolean On;
    void switchOn(){
        On=true;
        System.out.println(On);
    }
    void switchOff(){
        On=false;
        System.out.println(On);
    }
    public static void main(String[] args) {
       Light led=new Light();
       Light halogen=new Light();
       led.switchOn();
       halogen.switchOff();
    }
}
