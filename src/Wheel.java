enum Material{
    RUBBER,CARBON,PLASTIC,STEAL,ALUMINIUM;
}
public class Wheel {

    private int circumference = 10;//size of wheel
    private int speed = 0;
    private int distanceTravelled = 0;
    private boolean isBrakeApplied = true;


    //backWheel behavior
    public void rotate(int rpm){
        if(isBrakeApplied) {
            this.speed = circumference * rpm;
        }

    }
    static class Calculate{//helper class for calculating speed distance
        public void calSpeed(){}
        public void calDis(){}
    }


    // getters setters

    public int getCircumference() {
        return circumference;
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


    public void setBrakeApplied(boolean brakeApplied){
        this.isBrakeApplied = brakeApplied;
    }
    public boolean getBrakeApplied(){
        return isBrakeApplied;
    }
}
class FrontWheel extends Wheel {
    private  int angleOfRotation = 90;
    public void turnLeft(){
        angleOfRotation+=30;
    }
    public void turnRight(){angleOfRotation-=30;}


    public int getAngleOfRotation() {
        return angleOfRotation;
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