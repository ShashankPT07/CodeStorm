class TabletRunner {
    public static void main(String[] args) {
        Tablet tablet = new Tablet();

        System.out.println("Displaying with brand only:");
        tablet.displayTabletDetails("Samsung");

        System.out.println("Displaying with brand and model:");
        tablet.displayTabletDetails("Samsung", "Galaxy Tab S7");

        System.out.println("Displaying with brand, model, and screen size:");
        tablet.displayTabletDetails("Samsung", "Galaxy Tab S7", 11);

        System.out.println("Displaying with brand, model, screen size, and battery life:");
        tablet.displayTabletDetails("Samsung", "Galaxy Tab S7", 11, 15);

        System.out.println("Displaying with brand, model, screen size, battery life, and 5G support:");
        tablet.displayTabletDetails("Samsung", "Galaxy Tab S7", 11, 15, true);
    }
}