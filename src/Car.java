import java.time.LocalTime;
public class Car{
    private Color color = Color.BLUE;
    private int speed;
    private int gear;
    private int distanceTravelled;
    private boolean clutch = false;

    // objects
    private Wheel backWheel = new Wheel();
    private FrontWheel frontWheel = new FrontWheel();
    private Axle axle = new Axle(frontWheel,backWheel);
    private GearBox gearBox = new GearBox(axle);
    private GasTank gasTank = new GasTank();
    private Engine engine = new Engine(gearBox,gasTank);
    private MusicSystem musicSystem = new MusicSystem();
    private Brake brake = new Brake();
    private HandBrake handBrake = new HandBrake();

    private SteeringWheel steeringWheel = new SteeringWheel(frontWheel);
    private CarBody carBody = new CarBody();


    //pedals
    private Pedals acceleration = new Acceleration(engine);
    // behavior
    public void startCar(){
        engine.setEngineOn(true);
    }//start the car which starts engine
    public void stopCar(){
        engine.setEngineOn(false);
    } //stop the car and engine



    //pedals
    public void clutchApplied(){}//clutch enable
    public void clutchReleased(){}//disable Clutch
    public void accelerate(){}//instruction increase rpm of the engine which increase rotation of wheel
    public  void  decelerate(){}
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
        String tyre = frontWheel.getAngleOfRotation() == 120?"\\\\":frontWheel.getAngleOfRotation() == 90?"||":"//";
        return tyre +" Speed: "+backWheel.getSpeed()/10+", Distance Travelled: "+backWheel.getDistanceTravelled()+", Fuel: "+gasTank.getFuel()+" "+tyre;
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
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public boolean isClutch() {
        return clutch;
    }

    public void setClutch(boolean clutch) {
        this.clutch = clutch;
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
    public Pedals getAcceleration(){
        return  acceleration;
    }
    public void setRwd(Axle axle) {
        this.axle = axle;
    }
}