
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
    private final String color = Color.RED.toString();
    public void highBeam(){}
}
class HeadLight extends Lights{
    private final String color = Color.WHITE.toString();

    public void highBeam(){}
    public  void lowBeam(){}
}
class Indicator extends Lights{
    private final String color = Color.YELLOW.toString();
}