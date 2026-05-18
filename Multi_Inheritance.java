interface Camera{
    void takePhoto();
}
interface Music{
    void playMusic();
}
class Phone implements Camera, Music{
    public void takePhoto(){
        System.out.println("Take Photo");
    }
    public void playMusic(){
        System.out.println("Play Music");
    }
}
class Multi_Inheritance{
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.takePhoto();
        phone.playMusic();
    }
}