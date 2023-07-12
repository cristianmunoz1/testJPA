package testjpa;

import Logica.Estudiante;
import Persistencia.ControladorPersistencia;
import java.util.Date;

public class TestJPA {

    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("11111", "Cristian", "Munoz", new Date ("2/28/2001"));
        ControladorPersistencia control = new ControladorPersistencia();
        
        control.crearEstudiante(estudiante);
    }
    
}
