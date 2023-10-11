//wap to check no. of vowel are present
public class Main{
 public  static void main(String[] args){
      String a="Umbrella";
      boolean per=false;int l=0;
      for(int i=0;i<a.length();i++){
          if(a.charAt(i)=='a'||a.charAt(i)=='A'||a.charAt(i)=='e'||a.charAt(i)=='E'||a.charAt(i)=='i'||a.charAt(i)=='I'||a.charAt(i)=='o'||a.charAt(i)=='O'||a.charAt(i)=='u'||a.charAt(i)=='U'){
              per=true;
              l++;
          }
      }System.out.println("Total No. of Vowel/s:"+l);
 }
}