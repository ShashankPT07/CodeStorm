class Car {
    public String model;
    public Manufacturer manufacturer;
    public Engine engine;
    public Specs specs;

    public Car(String model, Manufacturer manufacturer, Engine engine, Specs specs) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.engine = engine;
        this.specs = specs;
    }

    public void displayDetails() {
        System.out.println("Car Model: " + model);
        System.out.println("Manufacturer: " + manufacturer.name + " (" + manufacturer.country + ")");
        System.out.println("Engine: " + engine.type + ", " + engine.horsepower + " HP");
        System.out.println("Specs: Color - " + specs.color + ", Doors - " + specs.numberOfDoors);
    }
}