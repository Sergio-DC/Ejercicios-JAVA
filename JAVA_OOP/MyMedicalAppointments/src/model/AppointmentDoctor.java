package model;

import java.util.Date;

public class AppointmentDoctor {
    private int id;
    private Patient patient;
    private Doctor doctor;
    private Date date;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;

}
