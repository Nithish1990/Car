

enum EngineType{
    ELECTRIC,DIESEL,PETROL;
}

public  class Engine {
    private boolean engineOn = false;
    private int horsePowerCC = 1000;//max threshold will be 100 for an eg....
    private final EngineType engineType = EngineType.ELECTRIC;

    //reference
    private GearBox gearBox;
    private GasTank gasTank;

    //methods
    public void setEngineOn(boolean engineOn) {
        this.engineOn = engineOn;
    }
    public void increaseRPM(int percentage){
        if(engineOn) {
            if (gasTank.getFuel() > 0) {
                gearBox.rotate(horsePowerCC/1000 * percentage);
                gasTank.consumeFuel();
            }else{
                gearBox.rotate(0);

            }
        }
    }
    public void decreaseRPM(int percentage){
        if(engineOn) {
            if (gasTank.getFuel() != 0) {
                gearBox.rotate(horsePowerCC/1000 * percentage);
                gasTank.consumeFuel();
            }
            else{
                gearBox.rotate(0);
            }
        }
    }



    //SETTER GETTERS
    public void setHorsePowerCC(int horsePowerCC){
        this.horsePowerCC = horsePowerCC;
    }
    public int getHorsePowerCC(){
        return horsePowerCC;
    }
    public EngineType getEngineType(){
        return  engineType;
    }
    public Engine(GearBox gearBox,GasTank gasTank){
        this.gearBox = gearBox;
        this.gasTank = gasTank;
    }
}

