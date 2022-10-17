public class SteeringWheel {
    RightLever rightLever = new RightLever();
    LeftLever leftLever = new LeftLever();
    private  int angelOfRotation = 90;
    public void turnLeft(FrontWheel wheel){
        angelOfRotation+=30;
        wheel.turnLeft();
    }
    public void turnRight(FrontWheel wheel){
        angelOfRotation-=30;
        wheel.turnRight();
    }
    public void horn(){}
    public  void setAngelOfRotation(int angelOfRotation){
        this.angelOfRotation = angelOfRotation;
    }

    public int getAngelOfRotation(){
        return angelOfRotation;
    }
}
class RightLever {

    public void offRightIndicator(Indicator rightIndicators[]){
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

