public class HandBrake {
    public BrakeType brakeType = BrakeType.ABS;
    private boolean handBrake = false;

    public void handBreakPush() {
        handBrake = true;
    }

    public void handBreakRelease() {
        handBrake = false;
    }

    public boolean isHandBrake() {
        return handBrake;
    }

    public void setHandBrake(boolean brake) {
        this.handBrake = brake;
    }
}
