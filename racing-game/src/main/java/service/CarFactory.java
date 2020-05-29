package service;

import domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    private CarFactory(){};

    public static List<Car> creatCars(int carNumbers){
        List<Car> cars=new ArrayList<>();
        for(int init=0; init<carNumbers; init++){
            cars.add(new Car(1));
        }
        return cars;
    }
}
