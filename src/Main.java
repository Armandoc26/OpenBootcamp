public class Main {
    public static void main(String[] args) {

        coche miCoche = new coche();
        miCoche.incrementarPuertasDelCoche();
        System.out.println(miCoche.puertasDelCohe);

        int resultado;
        resultado = suma(20, 30, 50);
        System.out.println(resultado);

    }

    public static int suma(int a, int b, int c) {
        return a + b + c;
    }
    public static class coche {
        public int puertasDelCohe = 4;

        public void incrementarPuertasDelCoche() {
            this.puertasDelCohe++;
        }

    }
}