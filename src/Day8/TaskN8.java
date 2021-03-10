package Day8;

public class TaskN8 {
    public static void main(String[] args) {
        String numbers = "";
        long before = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i <= 20000; i++){
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
