enum BrakeType{
    DISK,ABS,POWER;
}

public class Brake {
    public BrakeType brakeType = BrakeType.DISK;
    private boolean brake = false;
//    private float brakePercentage = 0f;
    public void brakePress() {
        brake = true;
    }
    //behavior
    public void brakeRelease() {
        brake = false;
    }


    public boolean isBrake() {
        return brake;
    }

    public void setBrake(boolean brake) {
        this.brake = brake;
    }

    // setGetter

    public BrakeType getBrakeType() {
        return brakeType;
    }

    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }


}
