class Circle1{
    private double radius;
    Circle1(double radius){
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public double Area(){
        return Math.PI * radius*radius;
    }
    public double Circumference(){
        return 2*Math.PI*radius;
    }
}
class Circle{
    public static void main(String[] args) {
        Circle1 obj = new Circle1(6.0);
        System.out.println(obj.getRadius());
        System.out.println(obj.Area());
        System.out.println(obj.Circumference());
    }
}