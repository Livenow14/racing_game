package domain;

import view.PrintStatus;

import java.util.List;
import java.util.stream.Collectors;

import static domain.MoveStatus.*;

public class CarBundle {

    private final List<Car> cars;

    public CarBundle(List<Car> cars) {
        this.cars = cars;
    }

   public void addDistance(){
        for(Car car : cars){
            MoveStatus moveStatus = decideMoveStop((int)(Math.random()*10));
            car.move(moveStatus);
            PrintStatus.print(car);
        }
       System.out.println();
    }

    private MoveStatus decideMoveStop(int randomNumber) {
        if(randomNumber>4) {
            return MOVE;
        }
        return STOP;
    }
}
