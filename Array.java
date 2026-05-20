import java.util.Arrays;
class DataSet{
    private double[] data;
    private int dataSize;
    private double sum;

    public DataSet(){
        data = new double[100];
        dataSize = 0;
        sum = 0;
    }
    public void add(double value){
        if (dataSize == data.length){
            System.out.println("Dataset is full");
            return;
        }
        data[dataSize] = value;
        dataSize++;
        sum += value;
    }
    public double getAvg(){
        return (dataSize == 0 ? 0 : sum/dataSize);
    }
    public double getStandardDeviation(){
        if (dataSize == 0){
            return 0;
        }
        double mean = getAvg();
        double sumSquare = 0.0;
        for (int i = 0; i < dataSize; i++){
            double diff = data[i] - mean;
            sumSquare += diff * diff;
        }
        return Math.sqrt(sumSquare/dataSize);
    }
    public static double calcAvg(DataSet[] datasets){
        double total = 0.0;
        for (DataSet ds : datasets){
            total += ds.getAvg();
        }
        return total / datasets.length;
    }
    public String ToString(){
        return "DataSet{" +
        "data = " + Arrays.toString(data) +
        ", dataSize= " + dataSize +
        ", sum= " + sum +
        "}";
    }
}
class Array{
    public static void main(String[] args) {
        DataSet dataset = new DataSet();
        dataset.add(2.7);
        dataset.add(10.2);
        dataset.add(3.6);
        System.out.println(dataset.getStandardDeviation());

        DataSet d1 = new DataSet();
        d1.add(4.7);
        d1.add(13.1);
        d1.add(3.8);

        DataSet d2 = new DataSet();
        d2.add(7.7);
        d2.add(6.1);
        d2.add(5.8);

        DataSet d3 = new DataSet();
        d3.add(2.5);
        d3.add(6.4);
        d3.add(9.3);

        DataSet[] datasets = {d1, d2, d3};
        System.out.println("Average of Averages: " + DataSet.calcAvg(datasets));
    }
}