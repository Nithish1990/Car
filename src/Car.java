

import java.util.Scanner;

public class Car{
    private Color color = Color.BLUE;
    private int distanceTravelled;

    // objects
    private Brake brake = new Brake();
    private Wheel backWheel = new Wheel(brake);
    private FrontWheel frontWheel = new FrontWheel(brake);
    private Axle axle = new Axle(frontWheel,backWheel);
    private GearBox gearBox = new GearBox(axle);
    private GasTank gasTank = new GasTank();
    private Clutch clutch = new Clutch(gearBox);
    private Engine engine = new Engine(clutch,gasTank);
    private MusicSystem musicSystem = new MusicSystem();

    private HandBrake handBrake = new HandBrake();
    private SteeringWheelAndWheel_Connector steeringWheelAndWheel_Connector = new SteeringWheelAndWheel_Connector(frontWheel);
    private SteeringWheel steeringWheel = new SteeringWheel(steeringWheelAndWheel_Connector);
    private CarBody carBody = new CarBody();
    //pedals
    private Pedals accelerationPedal = new AccelerationPedal(engine),clutchPedal = new ClutchPedal(clutch),brakePedal = new BrakePedal(brake);

    // behavior
    public void startCar(){
        engine.setEngineOn(true);
    }//start the car which starts engine
    public void stopCar(){
        engine.setEngineOn(false);
    } //stop the car and engine

    public void changeGear(int gear){
        /*
            as of now user can change gear by giving input later on user only can change gear by shifting the gear lever
         */
        gearBox.setGear(gear);

    }// user can swipe the gear handle
    public void handBrake(){}
    public void doorFunctions(){}//door fnc

    public void showStatusOfTheCar(){
        System.out.println(toString());// show the like meter bars eg speed distance fuel
    }

    @Override
    public String toString(){
        String tyre = frontWheel.getAngleOfRotation() == 120?"\\\\":frontWheel.getAngleOfRotation() == 90?"||":"//",direction = gearBox.getGear() != 6?"^":"\\/";
        return tyre +" Speed: "+backWheel.getSpeed()/10+
                ", Distance Travelled: "+backWheel.getDistanceTravelled()+
                ", Fuel: "+gasTank.getFuel()+
                " Current Gear "+gearBox.getGear()+
                ", Clutch "+(clutch.isEngage()?"//":"||")+
                ", Acceleration "+accelerationPedal.getPressingPercentage()+
                ", Brake "+brake.getFrictionToTheWheel()+
                ", "+tyre+", "+direction;
    }
    public void press(int userInput, Scanner sc){
        switch (userInput){
            case 1:// in future method overloading will be implemented
                userInput = sc.nextInt();
                press(getClutchPedal(),userInput);
                break;
            case 2:// brake
                userInput = sc.nextInt();
                press(getBrakePedal(),userInput);
                break;
            case 3:// acceleration
                userInput = sc.nextInt();
                press(getAccelerationPedal(),userInput);
                break;
        }//switch
    }
    //getter Setter

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }


    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public GearBox getGearBox() {
        return gearBox;
    }

    public void setGearBox(GearBox gearBox) {
        this.gearBox = gearBox;
    }

    public MusicSystem getMusicSystem() {
        return musicSystem;
    }

    public void setMusicSystem(MusicSystem musicSystem) {
        this.musicSystem = musicSystem;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public HandBrake getHandBrake() {
        return handBrake;
    }

    public void setHandBrake(HandBrake handBrake) {
        this.handBrake = handBrake;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = backWheel;
    }

    public FrontWheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(FrontWheel frontWheel) {
        this.frontWheel = frontWheel;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public CarBody getCarBody() {
        return carBody;
    }

    public void setCarBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public Axle getRwd() {
        return axle;
    }
    public void setRwd(Axle axle) {
        this.axle = axle;
    }

    public Pedals getClutch(){
        return clutchPedal;
    }

    public Pedals getAccelerationPedal() {
        return accelerationPedal;
    }

    public void setAccelerationPedal(Pedals accelerationPedal) {
        this.accelerationPedal = accelerationPedal;
    }

    public Pedals getClutchPedal() {
        return clutchPedal;
    }

    public void setClutchPedal(Pedals clutchPedal) {
        this.clutchPedal = clutchPedal;
    }

    public Pedals getBrakePedal() {
        return brakePedal;
    }

    public void setBrakePedal(Pedals brakePedal) {
        this.brakePedal = brakePedal;
    }

    public void setClutch(ClutchPedal clutch){
        this.clutchPedal = clutch;
    }

    public static void press(Pedals pedal,int userInput){
        if(userInput == 1){
            pedal.press();
        }else{
            pedal.release();
        }
    }
}