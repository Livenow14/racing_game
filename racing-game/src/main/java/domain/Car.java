package domain;

public class Car {

    private int distance;

    public Car(int distance ) {
        this.distance = distance;
    }

    public int getDistance(){
        return distance;
    }

    public void move(MoveStatus moveStatus){
        if(moveStatus.equals(MoveStatus.MOVE)){
            this.distance += 1;
        }
    }
}
