package model;

import java.util.Date;

public class AppointmentNurse implements ISchedulable, Runnable {
    private int id;
    private Nurse nurse;
    private Patient patient;
    private Date date;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    private String time;

    @Override
    public void schedule(Date Date, String time) {

    }

    @Override
    public void run() {

    }
}
