
package BEAN;

public class Nombrado extends Empleado {
    private int anioIng;

    public Nombrado() {
    }

    public Nombrado(int anioIng, int idEmpleado, String apellidos, String nombre, String dni, String tipo) {
        super(idEmpleado, apellidos, nombre, dni, tipo);
        this.anioIng = anioIng;
        calculaSueldo();
    }
    
    public void calculaSueldo(){
        double s;
        if(this.anioIng <= 2000){
            s = 1300;
        }else{
            s = 1500;
        }   
        super.setSueldo(s);
    }
    
    public int getAnioIng() {
        return anioIng;
    }

    public void setAnioIng(int anioIng) {
        this.anioIng = anioIng;
    }
    
    
    public String repDatos(){
        String aux;        
        aux = super.repDatos();
        aux += "\nAño de Ingreso: " + this.anioIng;
        return aux;
    }
    
}
