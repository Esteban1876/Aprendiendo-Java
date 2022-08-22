package EjerciciosTema3;

public class Parte2 {

    public static void main(String[] args) {
        Coche mazda = new Coche();
        mazda.incrementa(4);

        mazda.mostrarCoche();
    }

    public static class Coche{
        int NumeroPuertas = 0;

        public void incrementa(int puertas){
            NumeroPuertas += puertas;
        }

        public void mostrarCoche(){
            System.out.println("Cantidad de puertas: " + NumeroPuertas);
        }
    }
}

