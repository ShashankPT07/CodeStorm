package comm.xworkz.Car.bridge;

import comm.xworkz.Car.internal.*;

public class ModelImpl implements Model {
    @Override
    public CarInfo CarName(CarInfo carInfo) {
        System.out.println("This is subclass: " + CarInfo.name + " - " + CarInfo.year);
        return carInfo;
    }

    @Override
    public CarBrand Brand(CarBrand carBrand) {
        System.out.println("This is 2nd subclass: " + CarBrand.brandId + " - " + CarBrand.brandName);
        return carBrand;
    }

    @Override
    public CarModel Model(CarModel carModel) {
        System.out.println("This is 3rd subclass: " + CarModel.modelName + " - " + CarModel.variant);
        return carModel;
    }

    @Override
    public CarEngine Engine(CarEngine carEngine) {
        System.out.println("This is 4th subclass: " + CarEngine.engineType + " - " + CarEngine.horsePower + " HP");
        return carEngine;
    }

    @Override
    public CarPrice Price(CarPrice carPrice) {
        System.out.println("This is 5th subclass: " + CarPrice.name + " - Price: $" + CarPrice.amount);
        return carPrice;
    }
}
