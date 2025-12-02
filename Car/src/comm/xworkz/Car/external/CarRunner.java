package comm.xworkz.Car.external;

import comm.xworkz.Car.bridge.Brand;
import comm.xworkz.Car.bridge.*;
import comm.xworkz.Car.internal.*;

public class CarRunner {
    public static void main(String[] args) {
        Car car = new CarImpl();
        car.CarName(new CarInfo("Tesla Model S", 2024));
        car.Brand(new CarBrand(101, "Tesla"));
        car.Model(new CarModel("Model S", "Plaid"));
        car.Engine(new CarEngine("Electric", 1020));
        car.Price(new CarPrice("Tesla Model S", 135000));
        System.out.println("---------------------------------");

        Brand brand = new BrandImpl();
        brand.CarName(new CarInfo("BMW X5", 2023));
        brand.Brand(new CarBrand(102, "BMW"));
        brand.Model(new CarModel("X5", "xDrive40i"));
        brand.Engine(new CarEngine("Petrol", 375));
        brand.Price(new CarPrice("BMW X5", 90000));
        System.out.println("---------------------------------");

        Model model = new ModelImpl();
        model.CarName(new CarInfo("Audi Q7", 2022));
        model.Brand(new CarBrand(103, "Audi"));
        model.Model(new CarModel("Q7", "Premium Plus"));
        model.Engine(new CarEngine("Diesel", 335));
        model.Price(new CarPrice("Audi Q7", 85000));
        System.out.println("---------------------------------");

        Engine engine = new EngineImpl();
        engine.CarName(new CarInfo("Mercedes E-Class", 2024));
        engine.Brand(new CarBrand(104, "Mercedes"));
        engine.Model(new CarModel("E-Class", "E350"));
        engine.Engine(new CarEngine("Hybrid", 400));
        engine.Price(new CarPrice("Mercedes E-Class", 95000));
        System.out.println("---------------------------------");

        Price price = new PriceImpl();
        price.CarName(new CarInfo("Porsche 911", 2025));
        price.Brand(new CarBrand(105, "Porsche"));
        price.Model(new CarModel("911", "Turbo S"));
        price.Engine(new CarEngine("Petrol", 640));
        price.Price(new CarPrice("Porsche 911", 250000));
        System.out.println("---------------------------------");
    }
}

