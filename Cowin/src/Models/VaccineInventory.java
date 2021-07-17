package Models;

public class VaccineInventory {
    private int CovaxQuantity;
    private int CoviShieldQuantity;


    public VaccineInventory(int CovaxQuantity,int CoviShieldQuantity) {
        this.CovaxQuantity = CovaxQuantity;
        this.CoviShieldQuantity = CoviShieldQuantity;
    }

    public int getCovaxQuantity() {
        return CovaxQuantity;
    }

    public void setCovaxQuantity(int covaxQuantity) {
        CovaxQuantity = covaxQuantity;
    }

    public int getCoviShieldQuantity() {
        return CoviShieldQuantity;
    }

    public void setCoviShieldQuantity(int coviShieldQuantity) {
        CoviShieldQuantity = coviShieldQuantity;
    }

    @Override
    public String toString(){
        return "VaccineInventory{" +
                "Covax='" + CovaxQuantity+ '\''+
                ", CoviShield='" + CoviShieldQuantity + '\'' +
                '}';
    }
}
