public class Car{

    private String color = Color.BLUE.toString();
    private int speed;
    private int gear;
    private int distanceTravelled;
    private boolean clutch = false;
    private float fuel = 100f;

    // objects
    Engine engine = new Engine();
    GearBox gearBox = new GearBox();
    MusicSystem musicSystem = new MusicSystem();
    Brake brake = new Brake();
    HandBrake handBrake = new HandBrake();
    Wheel backWheel = new Wheel();
    FrontWheel frontWheel = new FrontWheel();
    SteeringWheel steeringWheel = new SteeringWheel();
    CarBody carBody = new CarBody();
    RWD_Axle rwd = new RWD_Axle();

    public void turnLeft(){
        steeringWheel.turnLeft(frontWheel);
    }
    public void turnRight(){
        steeringWheel.turnRight(frontWheel);
    }
    public void clutchApplied(){}
    public void startCar(){}
    public void stopCar(){}

    public void accelerate(){}
    public  void  decelerate(){}
    public void changeGear(int gear){}
    public void handBrake(){}
    public void doorFunctions(){}

    public void showStatusOfTheCar(){
        System.out.println(toString());
    }

    @Override
    public String toString(){
        return "Speed: "+this.speed+", Distance Travelled: "+this.distanceTravelled+", Fuel: "+this.fuel;
    }

    //getter Setter
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }

    public boolean getClutch() {
        return clutch;
    }


    public float getFuel() {
        return fuel;
    }

    public void setFuel(float fuel) {
        this.fuel = fuel;
    }

}