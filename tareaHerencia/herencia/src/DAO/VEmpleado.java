
package DAO;

import BEAN.*;
import java.util.Vector;

public class VEmpleado {
    Vector vecEmpleado;

    public VEmpleado() {
        vecEmpleado = new Vector();
    }
    
    
    public void agregaEmpleado(Consultor cons){
        this.vecEmpleado.addElement(cons);
    }
    public void agregaEmpleado(Nombrado nomb){
        this.vecEmpleado.addElement(nomb);
    }
    public void agregaEmpleado(Contratado cont){
        this.vecEmpleado.addElement(cont);
    }
    public void repGen(){
        String aux;
        Consultor s  = new Consultor();
        Nombrado n = new Nombrado();
        Contratado c = new Contratado();

        for (int i = 0; i < vecEmpleado.size(); i++){
            if (vecEmpleado.get(i).getClass().equals(s.getClass())){
                s = (Consultor)vecEmpleado.get(i);
                aux = s.repDatos();
            }else if(vecEmpleado.get(i).getClass().equals(n.getClass())){
                n = (Nombrado)vecEmpleado.get(i);    
                aux = n.repDatos();
            }else{
                c = (Contratado)vecEmpleado.get(i);
                aux = c.repDatos();
            }
            System.out.println(aux);
              System.out.println("==================");
        }
        
        
    }
    
}
