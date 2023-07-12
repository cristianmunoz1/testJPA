package Persistencia;

import Logica.Estudiante;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladorPersistencia {
    
    EstudianteJpaController estudianteJPA = new EstudianteJpaController();
    
    public void crearEstudiante (Estudiante estudiante){
        
        try {
            estudianteJPA.create(estudiante);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
