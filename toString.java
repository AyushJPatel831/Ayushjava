class Name{
    String name;
    String surname;
    Name(String name,String surname)
    {
        this.name=name;
        this.surname=surname;
    }
    public static Name Plus(Name n1,Name n2){
    return new Name(n1.name+n1.surname,n2.name+n2.surname);
    }
}
class Well{
    public static void main(String[] args){
        Name n1=new Name("Rohit","Sharma");
        Name n2=new Name("Virat","Kohli");
        Name n3=Name.Plus(n1,n2);
        System.out.println(n3.name+" & "+n3.surname);
    }
}