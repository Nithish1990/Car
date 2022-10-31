import java.util.Scanner;

public class Main{
    public static void main(String[] args){
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
            System.out.println("-----------------------------------------------------------------------------------------------------------------");
            System.out.println("Enter to \n 1.GearBox \n 2.Pedals \n 3.For Steering Control (lever control yet to implement) \n 4.To start the car Or To off the car\n 5.For exit");
            car.showStatusOfTheCar();
            userInput = sc.nextInt();
            switch (userInput) {
                case 1://hand break also come here
                    System.out.println("Enter the gear to change " );
                    userInput = sc.nextInt();
                    car.changeGear(userInput);
                    break;
                case 2:
                    System.out.println("Enter\n 1.Clutch\n 2 Brake \n 3 Acceleration");
                    userInput = sc.nextInt();
                    System.out.println("press 1 to Press or any other int  to Release");
                    car.press(userInput,sc);
                    break;
                case 3:// steeringWheel fnc
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
                case 4:
                    System.out.println("To Start the car press 1 or any to stop");
                    userInput = sc.nextInt();
                    if(userInput == 1)
                        car.startCar();
                    else
                        car.stopCar();
                    break;
                case 5:
                    System.out.println("source code in  https://github.com/Nithish1990/Car/tree/master/src Thank you.... ");
                    return;
            }
        }
    }
}
