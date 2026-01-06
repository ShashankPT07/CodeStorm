class ApplianceRunner {
    public static void main(String[] args) {
        Refrigerator.setPowerUsage();
        Refrigerator fridge = new Refrigerator();
        fridge.displayModel();
    }
}
