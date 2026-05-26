interface Shape{
    public double getArea();
}
class Rectangle implements Shape{
    private double width;
    private double length;

    Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    @Override
    public double getArea(){
        return width * length;
    }
}
class Circle implements Shape{
    private double radius;

    Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        return Math.PI * radius * radius;
    }
}
class AreaCalc{
    public double sumArea(Shape[] shapes){
        double TotalArea = 0;
        for (Shape shape : shapes){
            TotalArea += shape.getArea();
        }
        return TotalArea;
    }
}
class Area{
    public static void main(String[] args) {
        Shape[] shape = new Shape[2];
        shape[0] = new Rectangle(5,4);
        shape[1] = new Circle(6);
        AreaCalc calc = new AreaCalc();
        double Total = calc.sumArea(shape);
        System.out.println("Total area: " + Total);
    }
}