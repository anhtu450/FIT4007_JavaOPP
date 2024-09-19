public class Main {
    public static void main(String[] args) {
        int sum = 0;

        // Sử dụng vòng lặp for để tính tổng 10 số chẵn đầu tiên
        for (int i = 1; i <= 10; i++) {
            sum += 2 * i; // Tính số chẵn thứ i
        }

        // Xuất ra tổng
        System.out.println("Tổng của 10 số chẵn đầu tiên là: " + sum);
    }
}