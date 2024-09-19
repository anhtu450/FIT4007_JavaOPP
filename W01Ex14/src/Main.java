public class Main {
    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Vui lòng nhập một số nguyên n.");
            return;
        }


        int n = Integer.parseInt(args[0]);
        int sum = 0;


        if (n % 2 == 0) {

            for (int i = 1; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("Tổng các số lẻ từ 1 đến " + n + " là: " + sum);
        } else {

            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
            System.out.println("Tổng các số chẵn từ 2 đến " + n + " là: " + sum);
        }
    }
}