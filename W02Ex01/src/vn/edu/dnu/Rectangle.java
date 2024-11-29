package vn.edu.dnu;
public class Rectangle {

    private double length;
    private double width;

    public void setLength(double length) {
        this.length = length;
    }

    public double getLength(){
        return length;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getWidth(){
        return width;
    }

    public double calculateArea(){
        return length * width;
    }

    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    public String toString(){
        return "Length: " + length + "\n" + ", Width: " + width + "\n" +
                ", Area: " + calculateArea() + "\n" + ", Perimeter: " + calculatePerimeter();
    }
}