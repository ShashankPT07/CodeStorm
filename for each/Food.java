class Food {
    public int foodId;
    public String foodName;

    public Food(int foodId, String foodName) {
        this.foodId = foodId;
        this.foodName = foodName;
    }

    public void displayInfo() {
        System.out.println("Food ID: " + foodId + ", Food Name: " + foodName);
    }
}



