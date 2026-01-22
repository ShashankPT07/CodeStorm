

class Camera {
    public void displayCameraDetails(String brand) {
        System.out.println("Brand: " + brand);
    }
    public void displayCameraDetails(String brand, String model) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
    public void displayCameraDetails(String brand, String model, int megapixels) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Megapixels: " + megapixels + " MP");
    }
    public void displayCameraDetails(String brand, String model, int megapixels, String sensorType) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Megapixels: " + megapixels + " MP");
        System.out.println("Sensor Type: " + sensorType);
    }
    public void displayCameraDetails(String brand, String model, int megapixels, String sensorType, int price) {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Megapixels: " + megapixels + " MP");
        System.out.println("Sensor Type: " + sensorType);
        System.out.println("Price: $" + price);
    }
}
