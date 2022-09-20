package EjercicioTema9;

public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        System.out.println("-- Cliente --");
        cliente.setNombre("Andrey");
        cliente.setEdad(28);
        cliente.setTelefono(321564786);
        cliente.setCredito(30000);

        System.out.println("Nombre: " + cliente.getNombre());
        System.out.println("Edad: " + cliente.getEdad());
        System.out.println("Telefono: " + cliente.getTelefono());
        System.out.println("Credito: " + cliente.getCredito());

        System.out.println("");
        System.out.println("-- Trabajador --");
        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("Esteban");
        trabajador.setEdad(19);
        trabajador.setTelefono(32456787);
        trabajador.setSalario(2000);

        System.out.println("Nombre: " + trabajador.getNombre());
        System.out.println("Edad: " + trabajador.getEdad());
        System.out.println("Telefono: " + trabajador.getTelefono());
        System.out.println("Salario: " + trabajador.getSalario());
    }
}
