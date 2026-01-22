class LaptopRunner {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        
        System.out.println("Displaying with brand only:");
        laptop.displayLaptopDetails("Dell");
        
        System.out.println("\nDisplaying with brand and model:");
        laptop.displayLaptopDetails("Dell", "XPS 15");
        
        System.out.println("\nDisplaying with brand, model, and RAM size:");
        laptop.displayLaptopDetails("Dell", "XPS 15", 16);
        
        System.out.println("\nDisplaying with brand, model, RAM size, and storage:");
        laptop.displayLaptopDetails("Dell", "XPS 15", 16, 512);
        
        System.out.println("\nDisplaying with brand, model, RAM size, storage, and dedicated GPU:");
        laptop.displayLaptopDetails("Dell", "XPS 15", 16, 512, true);
    }
}