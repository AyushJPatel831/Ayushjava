import java.util.*;
public class Main{
 public  static void main(String[] args){
      String r5="@acropolis.in";
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter Name :");
        String s1=sc.nextLine();
         System.out.println("Enter Enroll No:");
        String s2=sc.nextLine();
         System.out.println("Enter Year:");
        int year=sc.nextInt();
        String s=String.valueOf(year);String w=s1.concat(r5);
        System.out.println("Name:"+s1+"\nEnroll No:"+s2+"\nYear:"+s+"\nContact Info:"+w);
 }
}