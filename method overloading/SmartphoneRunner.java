class SmartphoneRunner {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        
        System.out.println("Displaying with brand only:");
        phone.displayPhoneDetails("Apple");
        
        System.out.println("\nDisplaying with brand and model:");
        phone.displayPhoneDetails("Apple", "iPhone 14");
        
        System.out.println("\nDisplaying with brand, model, and storage:");
        phone.displayPhoneDetails("Apple", "iPhone 14", 256);
        
        System.out.println("\nDisplaying with brand, model, storage, and color:");
        phone.displayPhoneDetails("Apple", "iPhone 14", 256, "Midnight");
        
        System.out.println("\nDisplaying with brand, model, storage, color, and 5G support:");
        phone.displayPhoneDetails("Apple", "iPhone 14", 256, "Midnight", true);
    }
}