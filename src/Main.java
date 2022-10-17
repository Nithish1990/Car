import java.io.IOException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Enter 1 to Start the car");
        int userInput = sc.nextInt();
        while (userInput!=1){
            System.out.println("Enter only 1 to Start the car");
            userInput = sc.nextInt();
        }
        car.startCar();
        while (true) {
            System.out.println("Enter to \n 1.ChangeGear\n 2.Acceleration \n 3.Brake\n 4.Clutch\n 5.Stop the car\n 6.For Steering Control");
        car.showStatusOfTheCar();
            userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    System.out.print("ENTER gear to Change... ");
                    userInput = sc.nextInt();
                    car.changeGear(userInput);
                    break;
                case 2:
                    System.out.println("To Accelerate Press 1 else to Decelerate");
                    userInput = sc.nextInt();
                    if (userInput == 1)
                        car.accelerate();
                    else
                        car.decelerate();
                    break;
                case 3:
                    if (true)
                        car.getHandBrake().handBreakPush();
                    else
                        car.getBrake().brakePush();
                    break;
                case 4:
                    car.clutchApplied();
                    break;
                case 5:
                    car.stopCar();
                    car.getHandBrake().handBreakPush();
                    break;
                case 6:
                    System.out.println("ENTER 1 to turn right, -1 to left and 0 to horn");
                    userInput = sc.nextInt();
                    if (userInput == 1) {
                        car.getSteeringWheel().turnRight(car.getFrontWheel());
                        car.turnRight();
                    }
                    else if (userInput == -1)
                        car.turnLeft();
                    else
                        car.getSteeringWheel().horn();
                    break;
                case 7:
                    car.startCar();
                    break;

            }
        }
    }
}
