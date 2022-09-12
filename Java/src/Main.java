public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, inicio del bootcamp XD");
    }


    abstract class Vehiculo{

        private String tipo;
        private String sonido;
        private int velocidadMaxima;

        public void setTipo(String tipo)
        {
            this.tipo = tipo;
        }

        public String getTipo() {
            return tipo;
        }

        abstract public String getSonido();

        abstract public void setSonid(String sonido);

        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }

        public void setVelocidadMaxima(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
        }
    }
}
