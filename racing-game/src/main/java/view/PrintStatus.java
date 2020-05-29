package view;

import domain.Car;

import java.util.List;

public class PrintStatus {

    private PrintStatus(){};

    public static void print(Car car){
        for(int moveCount=0; moveCount<car.getDistance(); moveCount++) {
            System.out.print("-");
        }
        System.out.println();
    }
}
