package Project;

public class Car {
    //Create a Class Car that would have the following fields: carPrice and color
    //and method calculateSalePrice() which should be returning a price of the car.
    //Create 2 sub classes: Sedan and Truck. The Truck class has a field as weight
    //and has its own implementation of calculateSalePrice() method in which
    //returned price is calculated as following: if weight>2000 then returned price
    //car should include 10% discount, otherwise 20% discount.
    //The Sedan class has field as length and also does it is own implementation
    //of calculateSalePrice(): if length of sedan is >20 feet then returned car price
    //should include 5% discount, otherwise 10% discount
    double carPrice;
    String carColor;

    public Car(double carPrice, String color) {
        this.carPrice = carPrice;
        this.carColor = color;
    }
    public double calculateSalePrice() {
        return carPrice;
    }
}
class Truck extends Car{
    private double weight;
    public Truck(double carPrice, String color,double weight) {
        super(carPrice, color);
        this.weight=weight;
    }
    public double calculateSalePrice() {
    if (weight > 2000) {
        carPrice=carPrice/100*90; // Discount 10%
    } else {
        carPrice=carPrice/100*80; // Discount 20%
    }
        System.out.println("Truck price is: "+carPrice);
        return carPrice;
    }}
class Sedan extends Car {
    double length;

    public Sedan(double carPrice, String color, double length) {
        super(carPrice, color);
        this.length = length;
    }

    @Override
    public double calculateSalePrice() {
        if (length > 20) {
            carPrice=carPrice/100*95; // Discount 5%
        } else {
            carPrice=carPrice/100*90; // Discount 10%
        }
        System.out.println("Sedan price is: "+carPrice);
        return carPrice;
}}
class CarTester {
    public static void main(String[] args) {
        Truck T = new Truck(198000, "black", 45000);
        T.calculateSalePrice();
        Sedan S = new Sedan(28000, "navy", 8);
        S.calculateSalePrice();
    }
}