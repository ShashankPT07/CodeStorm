package comm.xworkz.Car.bridge;

import comm.xworkz.Car.internal.*;

public interface Model {
    CarInfo CarName(CarInfo carInfo);
    CarBrand Brand(CarBrand carBrand);
    CarModel Model(CarModel carModel);
    CarEngine Engine(CarEngine carEngine);
    CarPrice Price(CarPrice carPrice);
}
