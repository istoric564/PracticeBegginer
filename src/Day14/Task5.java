package Day14;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(seriesSum(5));
    }
    public static String seriesSum(int n) {
        // Happy Coding ^_^
        double total = 0;
        for (double i = 0; i < n ; i++){
            total = total + 1/(1 + i * 3);
        }
        return (String.format("%.2f", total));
    }
}

