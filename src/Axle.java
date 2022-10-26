public class Axle{
    private static Material  material = Material.STEAL;
    private Wheel backWheel,frontWheel;// reference of wheels to rotate
    public void spin(int rpm){
        backWheel.rotate(rpm);
    }

    public Axle(FrontWheel frontWheel,Wheel backWheel){
        this.frontWheel = frontWheel;
        this.backWheel = backWheel;
    }
}