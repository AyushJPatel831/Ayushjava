public class ex{
    public void printArray(String[] s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
    public void printArray(Integer[] s){
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
    }
        public static void main(String args[]){
            ex e = new ex();
            String []s1 = {"john","john"};
            e.printArray(s1);
            Integer[]i={1,2,3,4};
            e.printArray(i);
        }
}
