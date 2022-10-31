enum Material{
    RUBBER,CARBON,PLASTIC,STEAL,ALUMINIUM;
}
public class Wheel {

    private int circumference = 10;//size of wheel
    private int speed = 0;
    private int distanceTravelled = 0;
    private Brake brake;

    //backWheel behavior
    public void rotate(int rpm){
            this.speed = circumference * (rpm/brake.getFrictionToTheWheel());
    }
    static class Calculate{//helper class for calculating speed ditance
        public void calSpeed(){}
        public void calDis(){}
    }

    // getters setters
    public int getCircumference() {
        return circumference;
    }
    public Wheel(Brake brake){
        this.brake = brake;
    }

    public void setCircumference(int circumference) {
        this.circumference = circumference;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getDistanceTravelled() {
        return distanceTravelled;
    }

    public void setDistanceTravelled(int distanceTravelled) {
        this.distanceTravelled = distanceTravelled;
    }
}
class FrontWheel extends Wheel {
    private  int angleOfRotation = 90;
    public void turnLeft(){
        angleOfRotation +=30;
        if(angleOfRotation>120)angleOfRotation = 120;
    }
    public void turnRight(){angleOfRotation -=30;
    if(angleOfRotation<60)angleOfRotation = 60;}
    public int getAngleOfRotation() {
        return angleOfRotation;
    }


    public FrontWheel(Brake brake){
        super(brake);
    }
}


class Tyre{
    private final Material material  = Material.RUBBER;
    private int airPressure = 50;

    public Material getMaterial() {
        return material;
    }

    public int getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(int airPressure) {
        this.airPressure = airPressure;
    }
}