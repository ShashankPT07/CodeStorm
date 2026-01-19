class CarRunner {
    public static void main(String[] args) {
        Engine engine = new Engine("V8 Turbo");
        Car car = new Car(engine);
        car.displayCar();
    }
}
