 class Animal
{
    protected String name;
    protected void display()
    {
         System.out.println("I am an animal");
    }
    
}
class Dog extends Animal
{
	public static void main(String[] args)
	{
	    Dog dog= new Dog();
	    dog.display();
		dog.name = "java";
		 System.out.println(dog.name);
		 
	}
}
