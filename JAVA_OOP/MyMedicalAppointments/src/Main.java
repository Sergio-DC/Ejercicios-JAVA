import model.Doctor;
import model.Patient;
import model.User;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        //showMenu();

        Doctor myDoctor = new Doctor("Carlos", "car@gmail.com");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "10am");
        myDoctor.addAvailableAppointment(new Date(), "1pm");

        System.out.println(myDoctor);

        User user = new Doctor("Alan", "alan@live.com");

        User userAnonymous = new User("Gabriel", "gab@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Anonymous method");
                System.out.println("name: " + this.getName() + "  email:  " + getEmail());

            }
        };
        userAnonymous.showDataUser();
        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient);

    }



}