package domain;

import service.NumberGenarator;
import service.RandomValueGenerator;
import view.PrintStatus;

import javax.sql.rowset.CachedRowSet;
import java.util.Collections;
import java.util.List;

import static domain.MoveStatus.*;

public class CarBundle {

    private final List<Car> cars;

    public CarBundle(List<Car> cars) {
        this.cars = cars;
    }

   public void addDistance(NumberGenarator numberGenarator){
           for(Car car : cars){
               MoveStatus moveStatus = decideMoveStop(numberGenarator.generate());
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
