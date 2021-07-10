package model;

public class Nurse extends User{
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    private String speciality;

    public Nurse(String name, String email) {
        super(name, email);
    }

}
