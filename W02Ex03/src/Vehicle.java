public class Vehicle {
    private String ownerName;
    private double value;
    private double cylinderCapacity;

    public Vehicle() {
        this.ownerName = "";
        this.value = 0.0;
        this.cylinderCapacity = 0.0;
    }

    public Vehicle(String ownerName, double value, double cylinderCapacity) {
        this.ownerName = ownerName;
        this.value = value;
        this.cylinderCapacity = cylinderCapacity;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getCylinderCapacity() {
        return cylinderCapacity;
    }

    public void setCylinderCapacity(double cylinderCapacity) {
        this.cylinderCapacity = cylinderCapacity;
    }

    public double calculateTax() {
        if (cylinderCapacity < 100) {
            return value * 0.01;
        } else if (cylinderCapacity <= 200) {
            return value * 0.03;
        } else {
            return value * 0.05;
        }
    }

    @Override
    public String toString() {
        return String.format("Owner: %s, Value: %.2f, Cylinder Capacity: %.2f, Tax: %.2f",
                ownerName, value, cylinderCapacity, calculateTax());
    }
}


