public class Main {
    public static void main(String[] args) {
        if (args.length < 1){
            System.out.println("Vui lòng nhập số nguyên: ");
            return;
        }

        int n = Integer.parseInt(args[0]);
        int sum = 0;

        for (int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println("Từ dòng 1 đến " + n + "là: " + sum);
    }
}