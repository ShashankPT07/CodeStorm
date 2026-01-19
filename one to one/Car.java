class Car {
    public String engineType;
    public Engine engine;

    public Car(Engine engine) {
        this.engineType = engine.type;
        this.engine = engine;
    }

    public void displayCar() {
        engine.engineDetails();
    }
}
