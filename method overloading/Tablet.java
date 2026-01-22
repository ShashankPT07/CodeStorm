

class Tablet {
    public void displayTabletDetails(String brand) {
        System.out.println("Brand: " + brand);
    }
    public void displayTabletDetails(String brand, String model) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    public void displayTabletDetails(String brand, String model, int screenSizeInInches) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInInches + " inches");
    }
    public void displayTabletDetails(String brand, String model, int screenSizeInInches, int batteryLifeHours) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInInches + " inches");
        System.out.println("Battery Life: " + batteryLifeHours + " hours");
    }
    public void displayTabletDetails(String brand, String model, int screenSizeInInches, int batteryLifeHours, boolean has5G) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInInches + " inches");
        System.out.println("Battery Life: " + batteryLifeHours + " hours");
        System.out.println("5G Support: " + has5G);
    }
}
