public abstract class Pedals {
    private int pressingPercentage = 1;
    public abstract void press();
    public abstract void release();


    public int getPressingPercentage(){
        return pressingPercentage;
    }
    public void setPressingPercentage(int pressingPercentage){
        this.pressingPercentage = pressingPercentage;
    }
}
class AccelerationPedal extends Pedals{
    private Engine engine;
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()+10);
        if(super.getPressingPercentage()>100)super.setPressingPercentage(100);
        engine.changeRPM(super.getPressingPercentage());
    }

    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()-10);
        if(super.getPressingPercentage()<0)super.setPressingPercentage(0);
        engine.changeRPM(super.getPressingPercentage());
    }

    public AccelerationPedal(Engine engine){
        this.engine = engine;
    }
}

class BrakePedal extends Pedals {
    private Brake brake;
    //behavior
    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()/10);
        if(super.getPressingPercentage()<1)
            super.setPressingPercentage(1);

        brake.increaseFriction(super.getPressingPercentage());
    }
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()*10);
        if(super.getPressingPercentage()>100)
            super.setPressingPercentage(100);
        brake.increaseFriction(super.getPressingPercentage());
    }
    // Setters and Getter
    public int getBrake() {
        return super.getPressingPercentage();
    }
    public void setBrake(int brake) {
        super.setPressingPercentage(brake);
    }

    public BrakePedal(Brake brake){
        this.brake = brake;
    }
}
class ClutchPedal extends Pedals{
    private Clutch clutch;
    @Override
    public void press() {
        clutch.setEngage(true);
    }
    @Override
    public void release() {
        clutch.setEngage(false);
    }
    public int getClutch(){
        return super.getPressingPercentage();
    }
    public void setClutch(boolean stateOfClutch){
        super.setPressingPercentage(stateOfClutch?1:0);
    }
    public ClutchPedal(Clutch clutch){
        this.clutch = clutch;
    }
}