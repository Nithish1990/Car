enum Material{
    RUBBER,CARBON,PLASTIC;
}
public class Wheel {
    private String material  = Material.RUBBER.toString();
    private int circumference = 10;
    private int speed;
    private int distanceTravelled = 0;
    private boolean rotationClockwise = true;
    private boolean isBrakeApplied;

    public void setBrakeApplied(boolean brakeApplied){
        this.isBrakeApplied = brakeApplied;
    }
    public boolean getBrakeApplied(){
        return isBrakeApplied;
    }


    public void rotate(int rpm,boolean brake){

    }
    public String getMaterial() {
        return material;
    }

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

    public boolean isRotationClockwise() {
        return rotationClockwise;
    }

    public void setRotationClockwise(boolean rotationClockwise) {
        this.rotationClockwise = rotationClockwise;
    }
    //getters setters

}
class FrontWheel extends Wheel {
    private  int angleOfRotation = 90;
    public void turnLeft(){
        angleOfRotation+=30;
    }
    public void turnRight(){
        angleOfRotation-=30;
    }

}