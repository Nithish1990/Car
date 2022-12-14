public class Clutch {
    private Material material = Material.STEAL;
    private  int transmittingPower = 1;
    private boolean isEngage = true;
    private GearBox gearBox;


    //Behavior
    public void spin(int rpm){
        if(!isEngage) {
            gearBox.rotate(rpm * transmittingPower);
        }
    }

    //Getter Setters
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public int getTransmittingPower() {
        return transmittingPower;
    }

    public void setTransmittingPower(int transmittingPower) {
        this.transmittingPower = transmittingPower;
    }

    public Clutch(GearBox gearBox){
        this.gearBox = gearBox;
    }

    public boolean isEngage() {
        return isEngage;
    }

    public void setEngage(boolean engage) {
        gearBox.setClutchApplied(engage);
        isEngage = engage;
    }
}
