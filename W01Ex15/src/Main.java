import com.sun.jdi.Value;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Vui lònh nhập ít nhất 1 số: ");
            return;
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        for (String arg : args) {
            try {
                int value = Integer.parseInt(arg);

                if (value > max) {
                    max = value;
                }
                if (value < min) {
                    min = value;
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá trị không hợp lệ: " + arg + ". Vui lòng nhập số nguyên.");
                return;
            }

            System.out.println("Giá trị lớn nhất là: + max");
            System.out.println("Giá trị lớn nhỏ là: + min");
        }
    }
}