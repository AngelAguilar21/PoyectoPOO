
package BEAN;

public class Contratado extends Empleado{
    private String fech_ini;
    private String fech_fin;
    private String rol;

    public Contratado() {
    }

    public Contratado(String fech_ini, String fech_fin, String rol, int idEmpleado, String apellidos, String nombre, String dni, String tipo) {
        super(idEmpleado, apellidos, nombre, dni, tipo);
        this.fech_ini = fech_ini;
        this.fech_fin = fech_fin;
        this.rol = rol;
        calculaSueldo();
    }
    
    public void calculaSueldo(){
        double s = 0;
        if (this.rol.equals("Auxiliar")){
            s = 1000;
        }else if (this.rol.equals("Asistente")){
            s  = 1500;
        }else{
            s = 2000;
        }
        super.setSueldo(s);
    }

    public String getFech_ini() {
        return fech_ini;
    }

    public void setFech_ini(String fech_ini) {
        this.fech_ini = fech_ini;
    }

    public String getFech_fin() {
        return fech_fin;
    }

    public void setFech_fin(String fech_fin) {
        this.fech_fin = fech_fin;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    public void CalculaSueldo(){
        
    }
    public String repDatos(){
        String aux;
        aux = super.repDatos();
        aux += "\nFecha de Inicio: " + this.fech_ini;
        aux += "\nFecha de Fin: " + this.fech_fin;
        aux += "\nRol: " + this.rol;
        return aux;
    }
    
    
    
}
