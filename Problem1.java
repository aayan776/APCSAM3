class Course{
    String title;
    Course(String title){
        this.title = title;
    }
    void getAccess(){
        System.out.println("Granting access to course: " + title);
    }
}
class Premium extends Course{
    Premium(String title){
        super(title);
    }
    @Override
    void getAccess(){
        System.out.println("Premium access given to course: " + title);
    }
}
class Problem1{
    public static void main(String[] args) {
        Course obj1 = new Course("Math");
        Premium obj2 = new Premium("Science");

        obj1.getAccess();
        obj2.getAccess();
    }
}