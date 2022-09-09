

public class ejercicio {
    /**
     * @param args
     */
    public static void main(String[] args) {
       Persona unaPersona = new Persona();
       unaPersona.setEdad(25);
       System.out.println(unaPersona.getEdad());
    }

    @Override
    public String toString() {
        return "ejercicio []";
    }


    }

    class Persona {
        private int edad = 30;
        private String nombre = "Vanesa";
        private int telefono = 15000000;

        /**
         * @param telefono
         */
        public Persona(int telefono) {
            this.telefono = telefono;
        }
        public Persona() {
        }
        public void setEdad(int edad){
            this.edad = edad;
        }
        public int getEdad(){
            return this.edad;
        }

        public void setNombre(String nombre){
            this.nombre = nombre;
        }
        public String getNombre(){
            return this.nombre;
        }

        public void setTelefono(int telefono){
            this.telefono = telefono;
        }
        public int getTelefono(){
            return this.telefono;
        }

    }
