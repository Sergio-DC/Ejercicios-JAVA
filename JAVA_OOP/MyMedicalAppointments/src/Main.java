import ui.UIMenu;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Sergio");
        myDoctor.name = "Carlos Hernandez";
        myDoctor.showName();
        System.out.println(Doctor.id);

        Doctor.id++;

        Doctor myDoctor2 = new Doctor();
        myDoctor2.showId();
        UIMenu.showMenu();

    }
}
