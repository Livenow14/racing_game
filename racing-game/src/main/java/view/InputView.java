package view;

import java.util.Scanner;

public class InputView {

    private Scanner scanner;

    public InputView(Scanner scanner) {
        this.scanner = scanner;
    }

    public int inputCarNumbers(){
        System.out.println("자동차의 대수는 몇 대 인가요?");
        return scanner.nextInt();
    }

    public int inputGameCount(){
        System.out.println("시도할 회수는 몇 회 인가요?");
        return scanner.nextInt();
    }
}
