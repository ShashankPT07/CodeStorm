

class Television {
    public void displayTVDetails(String brand) {
        System.out.println("Brand: " + brand);
    }
    public void displayTVDetails(String brand, String model) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    public void displayTVDetails(String brand, String model, int screenSizeInInches) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInInches + " inches");
    }
    public void displayTVDetails(String brand, String model, int screenSizeInInches, String resolution) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInInches + " inches");
        System.out.println("Resolution: " + resolution);
    }
    public void displayTVDetails(String brand, String model, int screenSizeInInches, String resolution, boolean isSmartTV) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Screen Size: " + screenSizeInInches + " inches");
        System.out.println("Resolution: " + resolution);
        System.out.println("Smart TV: " + isSmartTV);
    }
}
