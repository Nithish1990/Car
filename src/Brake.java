enum BrakeType{
    DISK,ABS,POWER,DRUM;
}
public class Brake{
    //properties
    private BrakeType brakeType = BrakeType.DISK;
    private int frictionToTheWheel = 1;
    // behavior

    public void increaseFriction(int percentage){
        frictionToTheWheel = percentage;
    }

    // getter setters
    public BrakeType getBrakeType() {
        return brakeType;
    }
    public void setBrakeType(BrakeType brakeType) {
        this.brakeType = brakeType;
    }
    public void setFrictionToTheWheel(int frictionToTheWheel){
        this.frictionToTheWheel = frictionToTheWheel;
    }
    public int getFrictionToTheWheel(){
        return frictionToTheWheel;
    }
}
