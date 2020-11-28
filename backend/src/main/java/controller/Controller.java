package controller;

import java.util.Scanner;

public class Controller {

    private ExecutionState executionState;
    private Scanner scanner;

    public Controller() {
        this.executionState = new ExecutionState(false);
        this.scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.navigation(controller.executionState);

    }

    private void navigation(ExecutionState executionState) {
        while(!executionState.isFinished()) {
            String input = scanner.nextLine();
            if(input.equals("metrics -g")) {
                executionState.printGlobalMetrics();
            }
            if(input.equals("coindata -p")) {
                executionState.printCoinPriceList();
            }
            if(input.equals("exit")) {
                executionState.setFinished();
            }
        }
    }
}
