package com.ranga;

import java.util.ArrayList;



public interface StudentDAO {
	public void createStudent(Student student) throws Exception;
	public Student getStudent(long matricula) throws Exception;
	public void updateStudent(Student student) throws Exception;
	public void deleteStudent(Student student) throws Exception;
	public ArrayList<Student> getAllStudents() throws Exception;
        
        
        public ArrayList<Carrera> getAllCarreras() throws Exception;
        public ArrayList<Facultad> getAllFacultades() throws Exception;
        public Usuario getUsuario(String usuario, String clave) throws Exception;


}
