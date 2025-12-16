class ShowroomRunner {
    public static void main(String[] args) {
        Showroom showroom = new Showroom();

        Bike bike1 = new Bike(301, "Yamaha R15");
        Bike bike2 = new Bike(302, "KTM Duke 200");
        Bike bike3 = new Bike(303, "Royal Enfield Classic");
        Bike bike4 = new Bike(304, "Bajaj Pulsar");

        Bike[] bikes = {bike1, bike2, bike3, bike4};

        showroom.displayBikes(bikes);
    }
}