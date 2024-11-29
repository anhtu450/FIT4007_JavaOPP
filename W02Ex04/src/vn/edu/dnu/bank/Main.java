package vn.edu.dnu.bank;
public class Main {
    public static void main(String[] args) {

        Account myAccount = new Account(123456, "Tú", 100.0);
        System.out.println("Thông tin tài khoản ban đầu:");
        System.out.println(myAccount);


        myAccount.deposit(50.0);
        System.out.println("\nSau khi nạp tiền:");
        System.out.println(myAccount);


        myAccount.withdraw(30.0);
        System.out.println("\nSau khi rút tiền:");
        System.out.println(myAccount);


        myAccount.maturity();
        System.out.println("\nSau khi đáo hạn:");
        System.out.println(myAccount);


        Account targetAccount = new Account(654321, "Duy");
        System.out.println("\nThông tin tài khoản mục tiêu:");
        System.out.println(targetAccount);


        myAccount.transfer(targetAccount, 50.0);
        System.out.println("\nSau khi chuyển khoản:");
        System.out.println("Tài khoản Alice:");
        System.out.println(myAccount);
        System.out.println("Tài khoản Bob:");
        System.out.println(targetAccount);
    }
}