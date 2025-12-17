class FoodRunner {
    public static void main(String[] args) {
        FoodMenu menu = new FoodMenu();

        Food food1 = new Food(1, "Pizza");
        Food food2 = new Food(2, "Burger");

        Food[] foods = {food1, food2};

        menu.displayFoods(foods);
    }
}
