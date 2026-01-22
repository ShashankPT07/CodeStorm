class CameraRunner {
    public static void main(String[] args) {
        Camera camera = new Camera();

        System.out.println("Displaying with brand only:");
        camera.displayCameraDetails("Canon");

        System.out.println("\nDisplaying with brand and model:");
        camera.displayCameraDetails("Canon", "EOS 5D");

        System.out.println("\nDisplaying with brand, model, and megapixels:");
        camera.displayCameraDetails("Canon", "EOS 5D", 30);

        System.out.println("\nDisplaying with brand, model, megapixels, and sensor type:");
        camera.displayCameraDetails("Canon", "EOS 5D", 30, "Full Frame");

        System.out.println("\nDisplaying with brand, model, megapixels, sensor type, and price:");
        camera.displayCameraDetails("Canon", "EOS 5D", 30, "Full Frame", 2500);
    }
}