public class Water_bottle {
    String brand;
    String color;
    int capacity;
    String type;

    boolean flag = false;

    public void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Capacity: " + capacity + "L");
        System.out.println("Type: " + type);
    }

    public void status() {
        if (capacity > 0) {
            System.out.println("The bottle has water.");
        } else {
            System.out.println("The bottle is empty.");
        }
    }

    public void drink_water() {
        if (capacity > 0) {
            System.out.println("Drinking water...");
            capacity--;
        } else {
            System.out.println("Bottle is empty, fill it first.");
        }
    }

    public void fill_water() {
        if (capacity < 5) {
            System.out.println("Filling water...");
            capacity++;
        } else {
            System.out.println("Bottle is full, can't add more water.");
        }
    }

    public static void main(String[] args) {
        Water_bottle myBottle = new Water_bottle();
        myBottle.brand = "Aquafina";
        myBottle.color = "Blue";
        myBottle.capacity = 3;
        myBottle.type = "Plastic";

        myBottle.display();
        myBottle.status();
        myBottle.drink_water();
        myBottle.drink_water();
        myBottle.drink_water();
        myBottle.drink_water();
        myBottle.status();
        myBottle.fill_water();
        myBottle.fill_water();
        myBottle.fill_water();
        myBottle.status();
        myBottle.display();
    }
}
