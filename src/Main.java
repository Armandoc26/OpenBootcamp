public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona();

        persona.setEdad(24);
        persona.setNombre("Armando");
        persona.setNumero_telefono(5688245678L);

        System.out.println(persona.getNombre());
        System.out.println(persona.getEdad());
        System.out.println(persona.getNumero_telefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private long numero_telefono;

                //EDAD
        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getEdad() {
            return this.edad;
    }

                //NOMBRE
        public void setNombre (String nombre) {
            this.nombre = nombre;
    }
        public String getNombre() {
            return this.nombre;
        }

                //NUMERO DE TELEFONO
        public void setNumero_telefono(long numero) {
            this.numero_telefono = numero;
    }
        public long getNumero_telefono(){
            return this.numero_telefono;
        }



}