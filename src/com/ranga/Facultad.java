package com.ranga;

import java.io.Serializable;

/**
 *
 * @author Bequie
 */
public class Facultad  implements Serializable {

	 int id_facultad;
         String facultad;
	
	public Facultad() {
		
	}
	
	public Facultad(int id_facultad, String facultad) {
		this.id_facultad = id_facultad;
		this.facultad = facultad;
	}

    Facultad (String id_facultad, String facultad) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_facultad() {
        return id_facultad;
    }

    public void setId_facultad(int id_facultad) {
        this.id_facultad = id_facultad;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
	
	
	@Override
	public String toString() {
		return "Facultad [id_facultad=" + id_facultad + ", facultad=" + facultad + "]";
	}	
}

