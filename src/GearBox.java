import com.sun.corba.se.spi.ior.ObjectKey;

public class GearBox{
    private int gear = 1;
    private int gearRatio[] = {1,2,4,5,7};// if gear increase the gear shaft the position to higher gear and increase torque
    private Axle axle;//has reference
    private int gearPositionX = 0,getGearPositionY = 0;


    //behavior
    public void shiftRight(){}
    public void shiftLeft(){}
    public void shiftUp(){}
    public void shiftDown(){}

    public void rotate(int rpm){
        if(gear != 6)
        axle.spin(rpm * gearRatio[gear]);
        else{
            axle.spinReverse(rpm * 1);
        }
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