class FoodMenu {
    public void displayFoods(Food[] foods) {
        for (Food food : foods) {
            food.displayInfo();
        }
    }
}