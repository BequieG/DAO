
package com.ranga;


import org.junit.Test;
import static org.junit.Assert.*;

public class DAOTest {
   
    
    @Test
    public void myTest() throws Exception
    {
        
        StudentDAOImpl test = new StudentDAOImpl();
        
        // clase Usuario
        Usuario user = new Usuario();
        
        test.getUsuario(null, null);
        
        user.id_usuario = 1;
        user.nombre = "Rebeca";
        user.usuario = "Bequie";
        user.clave = "Kaulitz";
        user.puesto = "admin";
        
        test.getUsuario(user.usuario, user.clave);
        assertEquals(user.getUsuario(),"Bequie");
        assertEquals(user.getClave(), "Kaulitz");
        //assertEquals(user.getClave(), "Kau");
        
        
        // Clase Facultad
        Facultad f = new Facultad();
        
        f. id_facultad = 1;
        f.facultad = "Ingenieria";
                
        test.getAllFacultades();
        assertEquals(f.getFacultad(), "Ingenieria");
     
        
        // Clase Carrera
        Carrera c = new Carrera();
        
        c.id_carrera = 2;
        c.carrera = "Ing. Software";
        
        test.getAllCarreras();
        assertEquals(c.getCarrera(), "Ing. Software");
        
        
        // Clase Student
        
        Student s = new Student();
        
        s.matricula = 244645;
        s.nombre = "Sarahi";
        s.apPaterno = "Guzman";
        s.apMaterno = "Robles";
        s.sexo = "Mujer";
        s.carrera = "Ing. Hardware";
        s.facultad = "Ingenieria";
        s.semestre = 9;
            
        test.getStudent(244645);
        assertEquals(s.getNombre(), "Sarahi");
        assertEquals(s.getNombre(), "Rebeca");
        
        s.matricula = 244645;
        s.nombre = "Rebeca";
        s.apPaterno = "Guzman";
        s.apMaterno = "Robles";
        s.sexo = "Mujer";
        s.carrera = "Ing. Software";
        s.facultad = "Ingenieria";
        s.semestre = 4;
        
        test.updateStudent(s);
        test.getStudent(244645);
        assertEquals(s.getNombre(), "Rebeca");
        //assertEquals(s.getNombre(), "Sarahi");
        
       
        
    }    


}
