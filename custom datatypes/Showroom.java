class Showroom {
    public void displayBikes(Bike[] bikes) {
        for (int nu = 0; nu < bikes.length; nu++) {
            Bike bike = bikes[nu];
            bike.displayInfo();
        }
    }
}
