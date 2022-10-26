
public abstract class Lights {
    private Boolean lightIsOn = false;
    public void onLight(){
        lightIsOn = true;
    }
    public  void  offLight(){
        lightIsOn = false;
    }
}
class BackLight extends Lights{
    private final Color color = Color.RED;
    public void highBeam(){}//on when on brake applied
}
class HeadLight extends Lights{
    private final Color color = Color.WHITE;

    public void highBeam(){}// on by user
    public  void lowBeam(){}//on by user
}
class Indicator extends Lights{
    private final Color color = Color.YELLOW;
}