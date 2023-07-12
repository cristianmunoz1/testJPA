package testjpa;

import Logica.Estudiante;
import Persistencia.ControladorPersistencia;
import java.util.Date;

public class TestJPA {

    public static void main(String[] args) {
        
        Estudiante estudiante = new Estudiante("1234", "Cristian", "Editado", new Date ("2/28/2001"));
        ControladorPersistencia control = new ControladorPersistencia();
        
        control.editarEstudiante(estudiante);
    }
    
}
