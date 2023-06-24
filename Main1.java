public class Main1 {
    public static void main(String[] args) {
        Persona persona = new Persona(21, "Lexs", 1234123412);
        System.out.println("Su edad es: "+ persona.getEdad());
        System.out.println("Su Nombre es: "+ persona.getNombre());
        System.out.println("Su Telefono es: "+ persona.getTelefono());

    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;
    
    public Persona (int edad, String nombre, int telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
     public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getNombre() {
        return nombre;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    public int getTelefono() {
        return telefono;
    }


}