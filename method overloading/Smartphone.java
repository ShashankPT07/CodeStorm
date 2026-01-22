class Smartphone {
    public void displayPhoneDetails(String brand) {
        System.out.println("Brand: " + brand);
    }
    public void displayPhoneDetails(String brand, String model) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    public void displayPhoneDetails(String brand, String model, int storageInGB) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storageInGB + "GB");
    }
    public void displayPhoneDetails(String brand, String model, int storageInGB, String color) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storageInGB + "GB");
        System.out.println("Color: " + color);
    }
    public void displayPhoneDetails(String brand, String model, int storageInGB, String color, boolean is5G) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Storage: " + storageInGB + "GB");
        System.out.println("Color: " + color);
        System.out.println("5G Support: " + is5G);
    }
}
