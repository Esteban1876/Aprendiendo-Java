package EjerciciosTema8;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Coche mazda = new Coche();
        mazda.Acelerar(45);
        mazda.Frenar(32);
    }
}

interface Vehiculo {
    void Acelerar(int cuantaVelocidad);
    void Frenar(int cuantaVelocidad);

}

class Coche implements Vehiculo {

    @Override
    public void Acelerar(int cuantaVelocidad) {
        System.out.println("He aumentado " + cuantaVelocidad + " km/h");
    }

    @Override
    public void Frenar(int cuantaVelocidad) {
        System.out.println("He disminuido " + cuantaVelocidad + " km/h");
    }
}




