public class EjercicioT8 {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setEdad(15);
        persona.setNombre("Clara");
        persona.setTelefono(12345678);

        System.out.println("Esta persona tiene " + persona.getEdad() + " años.");
        System.out.println("Se llama " + persona.getNombre());
        System.out.println("Su numero de telefono es " + persona.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
        
}
