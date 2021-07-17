package Models;

public class Centre {

    private VaccineInventory vaccineInventory;
    private String centerId;
    public Centre(String centerId,VaccineInventory vaccineInventory) {
        this.centerId=centerId;
        this.setVaccineInventory(vaccineInventory);
    }

    public String getcId() {
        return centerId;
    }

    public VaccineInventory getVaccineInventory() {
        return vaccineInventory;
    }

    public void setVaccineInventory(VaccineInventory vaccineInventory) {
        this.vaccineInventory = vaccineInventory;
    }

    @Override
    public String toString(){
        return "Center{" +
                "id='" + getcId()+ '\''+
                ", vaccineInventory='" + getVaccineInventory().toString() + '\'' +
                '}';
    }
}
