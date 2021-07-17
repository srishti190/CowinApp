package Models;

public class User {

    private String name;
    private String gender;
    private VaccineType preferredVaccineType;
    private String username;
    private boolean isbook;

    public User(String name,String username,String gender, VaccineType preferredVaccineType) {
        this.name = name;
        this.gender = gender;
        this.username=username;
        this.preferredVaccineType = preferredVaccineType;
    }

    public boolean getisIsbook() {
        return isbook;
    }

    public void setIsbook(boolean isbook) {
        this.isbook = isbook;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public VaccineType getPreferredVaccineType() {
        return preferredVaccineType;
    }

    public void setPreferredVaccineType(VaccineType preferredVaccineType) {
        this.preferredVaccineType = preferredVaccineType;
    }

    @Override
    public String toString(){
        return "User{" +
                " name='" + name + '\'' +
                ", gender='" + getGender() + '\'' +
                ", preferredVaccine=" + getPreferredVaccineType() +
                '}';
    }
}
