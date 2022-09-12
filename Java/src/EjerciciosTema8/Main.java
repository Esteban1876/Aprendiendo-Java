package EjerciciosTema8;

public class Main {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Esteban");
        persona.setEdad(19);
        persona.setTelefono(12343255);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getTelefono());

    }
}
