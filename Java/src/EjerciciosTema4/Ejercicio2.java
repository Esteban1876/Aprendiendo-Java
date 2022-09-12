package EjerciciosTema4;

public class Ejercicio2 {

    public static void main(String[] args) {
        int numeroIf = 1;
        int numeroWhile = 0;
        int numeroDoWhile = 1;
        int numeroFor = 0;
        String estacion = "verano";

        if (numeroIf <0){
            System.out.println("El numero es negativo");
        } else if (numeroIf >0) {
            System.out.println("El numero es positivo");
        } else {
            System.out.println("El numero es cero");
        }

        while (numeroWhile <= 3){
            System.out.println("Ciclo while");
            System.out.println(": " + numeroWhile);
            numeroWhile++;
        }

        do {
            System.out.println("Ciclo do while");
            System.out.println(": " + numeroDoWhile);
            numeroDoWhile++;
            System.out.println("Ahora es: " + numeroDoWhile);
        } while (numeroDoWhile==1);

        for (int i=0; i<=3; i++){
            System.out.println("Bucle for");
            System.out.println(": " + i);
        }

        switch (estacion){
            case "verano":
                System.out.println("La estacion actual es verano");
                break;
            case "primavera":
                System.out.println("La estacion actual es primavera");
                break;
            case "invierno":
                System.out.println("La estacion actual es invierno");
                break;
            case "otono":
                System.out.println("La estacion actual es otono");
                break;

            default:
                System.out.println("Esta estacion no existe");
        }
    }
}
