interface inter1{
    public void roar();
}
class lion implements inter1{
    public void roar(){
        System.out.println("Roar");
    }
}
class cub1 extends lion{
    public void roar(){
        System.out.println("meow");
    }
}
class cub2 extends lion{
    public void roar(){
        System.out.println("meow");
    }
}
class Test1{
    public static void main(String[] args) {
        
    }
}