

public class CarBody {
    public final String material = Material.PLASTIC.toString();
    public Door DriverDoor = new Door();
    public Door door[] = new Door[3];
    Indicator rightIndicators[] = new Indicator[3];
    Indicator leftIndicators[] = new Indicator[3];
    HeadLight rightHeadLight = new HeadLight();
    HeadLight leftHeadLight = new HeadLight();
    BackLight leftBackLight = new BackLight();
    BackLight rightBackLight = new BackLight();

}
class Door{
    private boolean doorOpen = false;;
    public  void openDoor(){}
    public void closeDoor(){}
    public void lock(){}
    public void unlock(){}
    public void openWindow(){}
    public void closeWindow(){}
}