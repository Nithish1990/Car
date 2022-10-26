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
            System.out.println("------------------------------------------------------------------");
            System.out.println("Enter to \n 1.ChangeGear\n 2.Acceleration \n 3.Brake (yet to implemented)\n 4.Clutch (yet to implemented)\n 5.Stop the car\n 6.For Steering Control \n 7.To start the car \n 8. for exit");
            System.out.println("the two line represents wheel orientation for an example and cap( ^ ) represent car moving in forward direction   " );
            car.showStatusOfTheCar();
            System.out.println("Fueling ");
            userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter the gear to change " );
                    userInput = sc.nextInt();
                    car.changeGear(userInput);
                    break;
                case 2:
                    System.out.println("To Accelerate Press 1 else to Decelerate");
                    userInput = sc.nextInt();
                    if (userInput == 1)
                        car.getAcceleration().press();
                    else
                        car.getAcceleration().release();
                    break;
                case 3:// yet to implemented
                    if (true)
                        car.getHandBrake().handBreakPush();
                    else
                        car.getBrake().brakePress();
                    break;
                case 4:// yet to implemented
                    car.clutchApplied();
                    break;
                case 5:
                    car.stopCar();
                    car.getHandBrake().handBreakPush();
                    break;
                case 6:// steeringWheel fnc
                    System.out.println("ENTER 1 to turn right, -1 to left and 0 to horn");
                    userInput = sc.nextInt();
                    if (userInput == 1) {
                        car.getSteeringWheel().turnRight();
                    }
                    else if (userInput == -1)
                        car.getSteeringWheel().turnLeft();
                    else
                        car.getSteeringWheel().horn();
                    break;
                case 7:
                    car.startCar();
                    break;
                case 8:
                    return;
            }
        }
    }
}
