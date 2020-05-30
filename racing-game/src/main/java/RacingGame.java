import domain.Car;
import domain.CarBundle;
import service.RandomValueGenerator;
import view.InputView;
import service.CarFactory;

import java.util.List;
import java.util.Scanner;

public class RacingGame {

    public void run(){
        InputView inputView = new InputView(new Scanner(System.in));
        List<Car> cars = CarFactory.creatCars(inputView.inputCarNumbers());
        int gameCount=inputView.inputGameCount();
        CarBundle carBundle = new CarBundle(cars);

        System.out.println("실행결과");
        while(gameCount>0){
            carBundle.addDistance(new RandomValueGenerator());
            gameCount--;
        }
    }
}
