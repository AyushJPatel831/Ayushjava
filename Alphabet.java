import java.util.*;
public class Alpha {

    public static void main(String[] args) {

    
        Scanner ab=new Scanner(System.in);
       char c = ab.next().charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
            System.out.println(c + " is vowel");
        else
            System.out.println(c+ " is consonant");

    }
}