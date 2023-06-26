public class Ejercicio_9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(21, "Lexs", 1234567890, 40000);

System.out.println("CLASE CLIENTE: ");
        System.out.println("Edad: "+ cliente.getEdad());
        System.out.println("Nombre: "+ cliente.getNombre());
        System.out.println("Telefono: "+ cliente.getTelefono());
        System.out.println("Credito: "+ cliente.getCredito());

System.out.println();
System.out.println("CLASE TRABAJADOR: ");
        Trabajador trabajador = new Trabajador(21, "Lexs", 1234567890,1500);
        System.out.println("Edad: "+ trabajador.getEdad());
        System.out.println("Nombre: "+ trabajador.getNombre());
        System.out.println("Telefono: "+ trabajador.getTelefono());
        System.out.println("Salario: "+ trabajador.getSalario());
    }
}
class Persona{
    private int Edad;
    private String Nombre;
    private int Telefono;

    public Persona (int edad, String nombre, int telefono){
        this.Edad = edad;
        this.Nombre = nombre;
        this.Telefono = telefono;
    }
    
    public void setEdad(int edad) {
        this.Edad = edad;
    }
     public int getEdad() {
        return Edad;
    }
    public void setNombre(String nombre) {
        this.Nombre = nombre;
    }
    public String getNombre() {
        return Nombre;
    }

    public void setTelefono(int telefono) {
        this.Telefono = telefono;
    }
    public int getTelefono() {
        return Telefono;
    }
}

class Cliente extends Persona{
    private double credito;
    public Cliente (int edad, String nombre, int telefono, double credito){
        super (edad, nombre, telefono);
        this.credito = credito;
    }
    public void setCredito( float credito){
        this.credito = credito;
    }
    public double getCredito(){
        return credito;
    }
}

class Trabajador extends Persona{
    private double salario;
    public Trabajador(int edad, String nombre, int telefono, double salario){
        super(edad, nombre, telefono);
        this.salario = salario;
    }
    public void setSalario(double salario){
        this.salario = salario;
    }
    public double getSalario(){
        return salario;
    }
}
