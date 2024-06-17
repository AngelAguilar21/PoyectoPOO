
package BEAN;

public class Empleado {
   private int idEmpleado;
   private String apellidos;
   private String  nombre;
   private String dni;
   private double sueldo;
   private String  tipo;

    public Empleado() {
    }

    public Empleado(int idEmpleado, String apellidos, String nombre, String dni, String tipo) {
        this.idEmpleado = idEmpleado;
        this.apellidos = apellidos;
        this.nombre = nombre;
        this.dni = dni;
        this.tipo = tipo;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

   
   public String repDatos(){
       String aux;
       aux = "Id Empleado: " + this.idEmpleado;
       aux += "\nApellidos: " + this.apellidos;
       aux += "\nNombres: " + this.nombre;
       aux += "\nDni: "+ this.dni;
       aux += "\nSueldo: " +this.sueldo;
       aux += "\nTipo: " + this.tipo;
       return aux;
   }
   
   
}
