class Refrigerator extends Appliance {
    public static void setPowerUsage() {
        powerUsage = 800;
        System.out.println("Refrigerator Power Usage: " + powerUsage + " watts");
    }

    public void displayModel() {
        modelName = "LG InstaView";
        System.out.println("Refrigerator Model: " + modelName);
    }
}
