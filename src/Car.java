public class Car{

    private Color color = Color.BLUE;
    private int speed;
    private int gear;
    private int distanceTravelled;
    private boolean clutch = false;
    private float fuel = 100f;

    // objects
    private GearBox gearBox = new GearBox();
    private MusicSystem musicSystem = new MusicSystem();
    private Brake brake = new Brake();
    private HandBrake handBrake = new HandBrake();
    private Wheel backWheel = new Wheel();
    private FrontWheel frontWheel = new FrontWheel();
    private SteeringWheel steeringWheel = new SteeringWheel();
    private CarBody carBody = new CarBody();
    private RWD_Axle rwd = new RWD_Axle();

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
    private Engine engine = new Engine();

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

    public RWD_Axle getRwd() {
        return rwd;
    }

    public void setRwd(RWD_Axle rwd) {
        this.rwd = rwd;
    }

}