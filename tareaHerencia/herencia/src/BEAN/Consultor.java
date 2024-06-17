
package BEAN;

public class Consultor extends Empleado {
    private float pagHor;
    private int numHor;

    public Consultor() {
    }

    public Consultor(float pagHor, int numHor, int idEmpleado, String apellidos, String nombre, String dni, String tipo) {
        super(idEmpleado, apellidos, nombre, dni, tipo);
        this.pagHor = pagHor;
        this.numHor = numHor;
        calculaSueldo();
    }
    
    public void calculaSueldo(){
        double s;
        s = this.pagHor * this.numHor;
        super.setSueldo(s);
    }
    
    public float getPagHor() {
        return pagHor;
    }

    public void setPagHor(float pagHor) {
        this.pagHor = pagHor;
    }

    public int getNumHor() {
        return numHor;
    }

    public void setNumHor(int numHor) {
        this.numHor = numHor;
    }
    
    public void CalculaSueldo(){
        float sueldo = pagHor * numHor;
        setSueldo(sueldo); 
    }
    
    public String repDatos(){
        String aux;
        aux = super.repDatos();
        aux += "\nPago por Hora: " +this.pagHor;
        aux += "\nNumero de Horas: " + this.numHor;
        return aux;
    }
    
    
}
