class TelevisionRunner {
    public static void main(String[] args) {
        Television tv = new Television();

        System.out.println("Displaying with brand only:");
        tv.displayTVDetails("Sony");

        System.out.println("Displaying with brand and model:");
        tv.displayTVDetails("Sony", "Bravia X90J");

        System.out.println("Displaying with brand, model, and screen size:");
        tv.displayTVDetails("Sony", "Bravia X90J", 65);

        System.out.println("Displaying with brand, model, screen size, and resolution:");
        tv.displayTVDetails("Sony", "Bravia X90J", 65, "4K");

        System.out.println("Displaying with brand, model, screen size, resolution, and smart TV support:");
        tv.displayTVDetails("Sony", "Bravia X90J", 65, "4K", true);
    }
}