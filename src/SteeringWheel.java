

public class SteeringWheel {
    private RightLever rightLever = new RightLever();
    private LeftLever leftLever = new LeftLever();
    private  int angelOfRotation = 90;
    private SteeringWheelAndWheel_Connector steeringWheelAndWheel_connector;

    //Behavior and methods
    public void turnLeft(){ //change the angle of in steering wheel which turn the FrontWheel
        angelOfRotation+=30;
        steeringWheelAndWheel_connector.turnLeft();
    }
    public void turnRight(){//change the angle of in steering wheel which turn the FrontWheel
        angelOfRotation-=30;
        steeringWheelAndWheel_connector.turnRight();
    }
    public void horn(){
        System.out.println("Horn sound");
    }


    //constructor
    public SteeringWheel(SteeringWheelAndWheel_Connector steeringWheelAxle){
        this.steeringWheelAndWheel_connector = steeringWheelAxle;
    }
    //getters Setters
    public  void setAngelOfRotation(int angelOfRotation){
        this.angelOfRotation = angelOfRotation;
    }

    public int getAngelOfRotation(){
        return angelOfRotation;
    }

    public void setRightLever(RightLever rightLever){
        this.rightLever = rightLever;
    }
    public void setLeftLever(LeftLever leftLever){
        this.leftLever = leftLever;
    }
    public RightLever getRightLever(){
        return  rightLever;
    }
    public  LeftLever getLeftLever(){
        return  leftLever;
    }
}
class RightLever {

    public void offRightIndicator(Indicator rightIndicators[]){// if offRightIndicator called all the light are off
        for(int i = 0;i<rightIndicators.length;i++)
            rightIndicators[i].offLight();
    }
    public void onRightIndicator(Indicator rightIndicators[]){
        for(int i = 0;i<rightIndicators.length;i++)
            rightIndicators[i].onLight();
    }
    public void offLeftIndicator(Indicator leftIndicators[]){
        for(int i = 0;i<leftIndicators.length;i++)
            leftIndicators[i].offLight();
    }
    public void onLeftIndicator(Indicator leftIndicators[]){
        for(int i = 0;i<leftIndicators.length;i++)
           leftIndicators[i].onLight();
    }
}

class LeftLever{
    public void headLightOnHighBeam(HeadLight headLight){
        headLight.highBeam();
    }
    public void headLightOnLowBeam(HeadLight headLight){
        headLight.lowBeam();
    }
}




