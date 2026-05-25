class Animal{
    private String name;
    private int age;
    Animal(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void MakeSound(){
        System.out.println("This animal makes a sound.");
    }
}
class Dog extends Animal{
    private String breed;
    Dog(String breed, String name, int age){
        super(name, age);
        this.breed = breed;
    }
    public String getBreed(){
        return breed;
    }
    @Override
    public void MakeSound(){
        System.out.println("Bark!");
    }
}
class Cat extends Animal{
    private boolean IsIndoor;
    Cat(boolean IsIndoor, String name, int age){
        super(name, age);
        this.IsIndoor = IsIndoor;
    }
    public boolean getIsIndoor(){
        return IsIndoor;
    }
    @Override
    public void MakeSound(){
        System.out.println("Meow!");
    }
}
class Sound{
    public static void main(String[] args) {
        Dog d = new Dog("Golden Retriever", "Tiger", 5);
        Cat c = new Cat(true, "Anaya", 2);

        System.out.println("Name: " + d.getName() + " Age: " + d.getAge() + " Breed: " + d.getBreed());
        d.MakeSound();
        System.out.println("Name: " + c.getName() + " Age: " + c.getAge() + " Is Indoors?: " + c.getIsIndoor());
        c.MakeSound();
    }
}