

class Laptop {
    public void displayLaptopDetails(String brand) {
        System.out.println("Brand: " + brand);
    }
    public void displayLaptopDetails(String brand, String model) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    public void displayLaptopDetails(String brand, String model, int ramInGB) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ramInGB + "GB");
    }
    public void displayLaptopDetails(String brand, String model, int ramInGB, int storageInGB) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ramInGB + "GB");
        System.out.println("Storage: " + storageInGB + "GB SSD");
    }
    public void displayLaptopDetails(String brand, String model, int ramInGB, int storageInGB, boolean hasDedicatedGPU) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("RAM: " + ramInGB + "GB");
        System.out.println("Storage: " + storageInGB + "GB SSD");
        System.out.println("Dedicated GPU: " + hasDedicatedGPU);
    }
}
