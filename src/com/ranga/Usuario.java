
package com.ranga;

import java.io.Serializable;

/**
 *
 * @author Bequie
 */


public class Usuario  implements Serializable {
	 int id_usuario;
	 String nombre;
         String usuario;
         String clave;
	 String puesto;
	
	public Usuario() {
		
	}
	
	public Usuario(int id_usario, String nombre, String usuario, String clave, String puesto) {
		this.id_usuario = id_usuario;
		this.nombre = nombre;
		this.usuario =  usuario;
                this.clave = clave;
                this.puesto =  puesto;
	}

    Usuario(String id_usuario, String nombre, String usuario, String clave, String puesto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    
  
	@Override
	public String toString() {
		return "Usuario [id_usuario=" + id_usuario + ", nombre=" + nombre + ", usuario=" + usuario + ", clave=" + clave + ", puesto=" + puesto +"]";
	}	
}
