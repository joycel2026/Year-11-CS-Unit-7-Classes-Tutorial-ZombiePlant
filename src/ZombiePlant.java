public class ZombiePlant {
    private int treatmentsNeeded;
    private int potency;
    public ZombiePlant(int potency, int treatmentsNeeded) {
        this.potency = potency;
        this.treatmentsNeeded = treatmentsNeeded;
    }
    public int getPotency() {
        return potency;
    }
    public int treatmentsNeeded() {
        return treatmentsNeeded;
    }
    public boolean isDangerous() {
        return treatmentsNeeded > 0;
    }
    public void treat(int treatmentPotency) {
        if (treatmentPotency <= potency && treatmentPotency >0 && treatmentsNeeded > 0) {
            treatmentsNeeded--;
        } else if (treatmentPotency >= potency && treatmentPotency >0 && treatmentsNeeded > 0) {
            treatmentsNeeded++;
        } else if (treatmentPotency >= potency && treatmentPotency >0 && treatmentsNeeded == 0){
            treatmentsNeeded=1;
        }
    }
}