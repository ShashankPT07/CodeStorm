class Laptop extends LaptopBase {
    public static void setPrice() {
        price = 150000;
        System.out.println("Laptop Price: " + price);
    }

    public void displayName() {
        name = "MacBook Pro";
        System.out.println("Laptop Name: " + name);
    }
}