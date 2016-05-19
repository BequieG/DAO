package com.ranga;

import java.io.Serializable;


public class Student implements Serializable {
	 long matricula;
	 String nombre;
         String apPaterno;
         String apMaterno;
         String sexo;
         String carrera;
         String facultad;
         int semestre;
	
	public Student() {
		
	}
	
	public Student(long matricula, String nombre, String apPaterno, String apMaterno, String sexo, String carrera, String facultad, int semestre) {
		this.matricula = matricula;
		this.nombre = nombre;
                this.apPaterno = apPaterno;
                this.apMaterno = apMaterno;
                this.sexo = sexo;
                this.carrera = carrera;
                this.facultad = facultad;
                this.semestre = semestre;
	}

	public long getMatricula() {
		return matricula;
	}
	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
        
        public String getApMaterno() {
            return apMaterno;
        }
        
        public void setApMaterno(String apMaterno) {
            this.apMaterno = apMaterno;
        }

        public String getApPaterno() {
            return apPaterno;
        }
        
        public void setApPaterno(String apPaterno) {
            this.apPaterno = apPaterno;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
            
        public String getCarrera() {
            return carrera;
        }

        public void setCarrera(String carrera) {
            this.carrera = carrera;
        }

        public String getFacultad() {
           return facultad;
       }

        public void setFacultad(String facultad) {
            this.facultad = facultad;
        }

        public int getSemestre() {
            return semestre;
        }

        public void setSemestre(int semestre) {
            this.semestre = semestre;
        }
            
    
	@Override
	public String toString() {
		return "Student[matricula=" + matricula + ", nombre=" + nombre + ", apPaterno=" + apPaterno +", apMaterno=" + apMaterno + ", sexo=" + sexo + ", carrera=" + carrera +", facultad=" + facultad + ", semestre=" + semestre +"]";
	}	
}
