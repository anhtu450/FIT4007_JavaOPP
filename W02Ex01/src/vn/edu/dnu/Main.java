package vn.edu.dnu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter length: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);

        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.println(rectangle);
    }
}
