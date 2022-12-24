public class Principal {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setEdad(23);
        p1.setNombre("Juan");
        p1.setTelefono(7953333);

        System.out.println(p1.getEdad() + " " + p1.getNombre() + " " + p1.getTelefono());
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
