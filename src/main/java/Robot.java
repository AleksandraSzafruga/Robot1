import javax.swing.*;

public class Robot {

    private double poziomBaterii = 100;
    private String name;
    private boolean włączony = false;

    public Robot (String name){
        this.name = name;
    }

    public void poruszRobota(RuchRobota ruchRobota) {

        if (!włączony){
            System.err.println("Robot jest wyłączony");
            return;
        }

        if (poziomBaterii >= ruchRobota.getZuzycieEnergii()) {
            System.out.println("Wykonuję ruch robota " +ruchRobota);
            poziomBaterii = poziomBaterii - ruchRobota.getZuzycieEnergii();
        } else
            System.err.println("Niewystarczająca ilość energii");
    }

    public void naładujRobota() {
       if (włączony){
           System.err.println("Nie mozna ładować robota jak jest włączony");
       } else
        poziomBaterii = 100;
        System.out.println("Robot naładowany");
    }

    public void włączRobota() {
        if (włączony) {
            System.out.println("Robot jest już włączony");
        }
        else włączony = true;

    }

    public void wyłączRobota() {
        if (!włączony) {
            System.out.println("Robot jest już włączony");
        }
        else włączony = false;
    }

}

