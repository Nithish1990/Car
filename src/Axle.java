public class Axle{
    private static final String  material = "METAL";
    public void spin(int rpm,Wheel wheel){}
}
class FWD_Axle extends Axle{
    public void spin(int rpm,Wheel wheel){}
}
class RWD_Axle extends Axle{
    @Override
    public void spin(int rpm,Wheel wheel){

    }
}
class _4WD_Axle extends Axle{
    @Override
    public void spin(int rpm,Wheel wheel){

    }
}