import java.util.*;
class ChangeCase{
    public static void main(String[] args){
        
        System.out.println("Enter String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter choice-0 for lowercase - 1 for uppercase :");
        int i=sc.nextInt();
        switch(i){
            case 0:{ 
               
                System.out.println( s.toUpperCase());break;
        }
    case 1:{
        System.out.println( s.toLowerCase());break;
    }
    default:System.out.println("Invalid");
    }
}
}