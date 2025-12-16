class Bike {
    public int bikeId;
    public String bikeName;

    public Bike(int bikeId, String bikeName) {
        this.bikeId = bikeId;
        this.bikeName = bikeName;
    }

    public void displayInfo() {
        System.out.println("Bike ID: " + bikeId + ", Bike Name: " + bikeName);
    }
}

