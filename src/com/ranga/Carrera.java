
package com.ranga;

import java.io.Serializable;

/**
 *
 * @author Bequie
 */
public class Carrera  implements Serializable {

	 int id_carrera;
         String carrera;
	
	public Carrera() {
		
	}
	
	public Carrera(int id_carrera, String carrera) {
		this.id_carrera = id_carrera;
		this.carrera = carrera;
	}

    Carrera (String id_carrera, String carrera) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
	
	
	@Override
	public String toString() {
		return "Carrera [id_carrera=" + id_carrera + ", carrera=" + carrera + "]";
	}	
}

