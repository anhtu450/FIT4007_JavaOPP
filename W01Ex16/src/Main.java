public class Main {
    public static void main(String[] args) {
        if (args.length > 2){
            System.out.println("Nhập hệ số a, b.");
            return;
        }
        try {

            double a = Double.parseDouble(args[0]);
            double b = Double.parseDouble(args[1]);

            if (a == 0){
                if (b == 0){
                    System.out.println("Phương trình có vô số nghiệm");
                } else {
                    System.out.println("Phương trình vô nghiệm");
                }
            } else {
                double x = -b / a;
                System.out.println("Nghiệm của phương trình " + a + "x + " + b + " = 0 là: x = " + x);
            }
        } catch (NumberFormatException e) {
            System.out.println("Hệ số a và b phải là số thực hợp lệ");
        }
    }
}