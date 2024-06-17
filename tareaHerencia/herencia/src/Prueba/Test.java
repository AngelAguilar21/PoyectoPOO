package Prueba;

import BEAN.*;
import DAO.VEmpleado;

public class Test {
    public static void main(String args[]) {
        
        Consultor cons2 = new Consultor(20, 40, 002, "Martínez", "Ana", "1234567", "Gerente");
        Contratado cont2 = new Contratado("20-03-2005", "20-03-2015", "Gerente", 003, "García", "Pedro", "9876543", "empleado");
        Nombrado nomb2 = new Nombrado(2005, 004, "González", "María", "5678901", "Gerente");
        
        VEmpleado vecEmple = new VEmpleado();
        
        vecEmple.agregaEmpleado(cons2);
        vecEmple.agregaEmpleado(cont2);
        vecEmple.agregaEmpleado(nomb2);
        
        vecEmple.repGen();
        
    }
}
   