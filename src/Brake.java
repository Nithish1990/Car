enum BrakeType{
    DISK,ABS,POWER;
}

public class Brake {
    public final String brakeType = BrakeType.DISK.toString();
    private boolean brake = false;

    public void brakePush() {
        brake = true;
    }

    public void brakePull() {
        brake = false;
    }


    public boolean isBrake() {
        return brake;
    }

    public void setBrake(boolean brake) {
        this.brake = brake;
    }
}
