import com.sun.corba.se.spi.ior.ObjectKey;

public class GearBox{
    private int gear = 1;
    private Axle axle;//has reference
    private int gearPositionX = 0,getGearPositionY = 0;


    //behavior
    public void shiftRight(){}
    public void shiftLeft(){}
    public void shiftUp(){}
    public void shiftDown(){}

    public void rotate(int rpm){
        axle.spin(rpm*gear);
    }

    //getter setters constructor
    public int getGear() {
        return gear;
    }
    public GearBox (Axle axle){
        this.axle = axle;
    }




    public void setGear(int gear){
        this.gear = gear;
    }
}