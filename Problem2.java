class Parking{
    int big,medium,small;
    public Parking(int big, int medium, int small){
        this.big = big;
        this.medium = medium;
        this.small = small;
    }  
    public boolean addCar(int carType){
        if (carType == 1 && big > 0){
            big--;
            return true;
        }
        if (carType == 2 && medium > 0){
            medium--;
            return true;
        }
        if (carType == 3 && small > 0){
            small--;
            return true;
        }
        return false;
    }
}
class Problem2{
    public static void main(String[] args) {
        Parking obj = new Parking(2,1,0);

        System.out.println(obj.addCar(1));
        System.out.println(obj.addCar(2));
        System.out.println(obj.addCar(3));
    }
}