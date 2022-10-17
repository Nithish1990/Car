enum EngineTypeBasedOnFuel{
    ELECTRIC,DIESEL,PETROL;
}

public  class Engine {
    private int rpm;
    private boolean engineOn = false;
    private float fuel;
    private int horsePowerCC = 10;
    private String typeOfEngine = EngineTypeBasedOnFuel.ELECTRIC.toString();

    //methods
    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }

    //SETTER GETTERS
    public int getRpm() {return rpm;}
    public float getFuel() {return fuel;}
    public void setHorsePowerCC(int horsePowerCC){
        this.horsePowerCC = horsePowerCC;
    }
    public int getHorsePowerCC(){
        return horsePowerCC;
    }
    public String getTypeOfEngine(){
        return  typeOfEngine;
    }
    public void increaseRPM(float fuel){}

    public void decreaseRPM(float fuel){}
}

