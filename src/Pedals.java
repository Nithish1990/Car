public abstract class Pedals {
    private int pressingPercentage = 0;
    public abstract void press();
    public abstract void release();


    public int getPressingPercentage(){
        return pressingPercentage;
    }
    public void setPressingPercentage(int pressingPercentage){
        this.pressingPercentage = pressingPercentage;
    }
}
class Acceleration extends Pedals{
    private Engine engine;
    @Override
    public void press() {
        super.setPressingPercentage(super.getPressingPercentage()+10);
        if(super.getPressingPercentage()>100)super.setPressingPercentage(100);
        engine.increaseRPM(super.getPressingPercentage());
    }

    @Override
    public void release() {
        super.setPressingPercentage(super.getPressingPercentage()-10);
        if(super.getPressingPercentage()<0)super.setPressingPercentage(0);
        engine.increaseRPM(super.getPressingPercentage());
    }

    public Acceleration(Engine engine){
        this.engine = engine;
    }
}
