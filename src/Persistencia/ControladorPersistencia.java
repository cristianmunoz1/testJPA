package Persistencia;

import Logica.Estudiante;
import Persistencia.exceptions.NonexistentEntityException;
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
    
    public void eliminarEstudiante (String id){
        try {
            estudianteJPA.destroy(id);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void editarEstudiante(Estudiante estudiante){
        try {
            estudianteJPA.edit(estudiante);
        } catch (Exception ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
