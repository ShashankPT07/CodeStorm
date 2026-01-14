
class CarRunner {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer("Toyota", "Japan");
        Engine engine = new Engine("V6", 300);
        Specs specs = new Specs("Red", 4);
        Car car = new Car("Camry", manufacturer, engine, specs);

        car.displayDetails();
    }
}