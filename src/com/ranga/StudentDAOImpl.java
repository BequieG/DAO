package com.ranga;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class StudentDAOImpl implements StudentDAO {
		
	@Override
	public void createStudent(Student student) throws Exception {		
		Connection con = null; // Declare Resources
		PreparedStatement pstmt = null;
		try {
			con = DBUtil.getConnection(); // Open Connection
			String sql = "INSERT INTO STUDENT(matricula,nombre,ap_paterno, ap_materno, sexo, carrera, facultad, semestre) VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt = con.prepareStatement(sql); // Create Statement
			pstmt.setLong(1, student.getMatricula()); // Set Parameters
                        pstmt.setString(2, student.getNombre());
                        pstmt.setString(3, student.getApPaterno());
                        pstmt.setString(4, student.getApMaterno());
                        pstmt.setString(5, student.getSexo());
                        pstmt.setString(6, student.getCarrera());
                        pstmt.setString(7, student.getFacultad());
                        pstmt.setInt(8, student.getSemestre());
                        DBUtil.beginTransaction(); // Begin Transaction
                        int result = pstmt.executeUpdate(); // Execute Statement
                        if (result != 0) {
                            DBUtil.commit(); // Commit Transaction
                        } else {
                            DBUtil.rollback(); // Roleback Transaction
                        }
		} finally {
			DBUtil.closeDBUtil(null, pstmt, con);  // Cleanup Resources	
		}            
	}
        
	@Override
	public void updateStudent(Student student) throws Exception {
		// Declare Resources
		Connection con = null; 
		PreparedStatement pstmt = null;
		try {                 
			con = DBUtil.getConnection(); // Open Connection
			String sql = "UPDATE STUDENT SET nombre=?, ap_paterno=?, ap_materno=?, sexo=?, carrera=?, facultad=?, semestre=? WHERE matricula =?";	        
			pstmt = con.prepareStatement(sql); // Create Statement 
			
                        pstmt.setString(1, student.getNombre());
                        pstmt.setString(2, student.getApPaterno());
                        pstmt.setString(3, student.getApMaterno());
                        pstmt.setString(4, student.getSexo());
                        pstmt.setString(5, student.getCarrera());
                        pstmt.setString(6, student.getFacultad());
                        pstmt.setInt(7, student.getSemestre());
                        pstmt.setLong(8, student.getMatricula()); // Set Parameters
                        DBUtil.beginTransaction(); // Begin Transaction
                        int result = pstmt.executeUpdate(); // Execute Statement
                        if (result != 0) {
                            DBUtil.commit(); // Commit Transaction
                        } else {
                            DBUtil.rollback(); // Roleback Transaction
                        }
		} finally {
			DBUtil.closeDBUtil(null, pstmt, con); // Cleanup Resources	
		}            
	}
	
	@Override
	public Student getStudent(long matricula) throws Exception {	
		String sql = "SELECT * FROM STUDENT WHERE matricula = " + matricula;
                Connection con = DBUtil.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                DBUtil.beginTransaction();
                Student student = null;
                if (rs.next()) {
                    student = new Student();
                    student.setMatricula(rs.getLong(1));
                    student.setNombre(rs.getString(2));
                    student.setApPaterno(rs.getString(3));
                    student.setApMaterno(rs.getString(4));
                    student.setSexo(rs.getString(5));
                    student.setCarrera(rs.getString(6));
                    student.setFacultad(rs.getString(7));
                    student.setSemestre(rs.getInt(8));
                    DBUtil.commit();
                } else {
                    DBUtil.rollback();
                }
                DBUtil.closeDBUtil(rs, stmt, con);
                return student;		
	}

	@Override
	public void deleteStudent(Student student) throws Exception {		
	Connection con = DBUtil.getConnection();
        String sql = "DELETE FROM STUDENT WHERE matricula = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setLong(1, student.getMatricula());
        DBUtil.beginTransaction();
        int res = pstmt.executeUpdate();
        if (res != 0) {
            DBUtil.commit();
        } else {
            DBUtil.rollback();
        }
        DBUtil.closeDBUtil(null, pstmt, con);
	}

	@Override
	public ArrayList<Student> getAllStudents() throws Exception {
	String sql = "SELECT * FROM STUDENT";
        Connection con = DBUtil.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Student> students = new ArrayList<Student>();      
        while(rs.next()) {
                    Student student = new Student();
                    student.setMatricula(rs.getLong(1));
                    student.setNombre(rs.getString(2));
                    student.setApPaterno(rs.getString(3));
                    student.setApMaterno(rs.getString(4));
                    student.setSexo(rs.getString(5));
                    student.setCarrera(rs.getString(6));
                    student.setFacultad(rs.getString(7));
                    student.setSemestre(rs.getInt(8));
            
            students.add(student);            
        }  
      
        DBUtil.closeDBUtil(rs, stmt, con);
        return students;		
	}	
          
        @Override
	public ArrayList<Carrera> getAllCarreras() throws Exception {
	String sql = "SELECT carrera FROM CARRERAS";
        Connection con = DBUtil.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Carrera> carreras = new ArrayList<Carrera>();         
        while(rs.next()) {
                    Carrera carrera = new Carrera();
                    carrera.setCarrera(rs.getString(1));
                    carreras.add(carrera);            
        }         
        DBUtil.closeDBUtil(rs, stmt, con);
        return carreras;		
	}	
         
        @Override
        public ArrayList<Facultad> getAllFacultades() throws Exception {
	String sql = "SELECT facultad FROM FACULTADES";
        Connection con = DBUtil.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(sql);
        ArrayList<Facultad> facultades = new ArrayList<Facultad>();         
        while(rs.next()) {
                    Facultad facultad = new Facultad();
                    facultad.setFacultad(rs.getString(1));
                    facultades.add(facultad);            
        }         
        DBUtil.closeDBUtil(rs, stmt, con);
        return facultades;		
	}

	public Usuario getUsuario(String usuario, String clave) throws Exception {	
		String sql = "SELECT * FROM USUARIOS WHERE usuario = '" + usuario + "' and clave = '" + clave +"'" ;
                Connection con = DBUtil.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);
                DBUtil.beginTransaction();
                Usuario usuarios = null;
                if (rs.next()) {
                    usuarios = new Usuario();
                    usuarios.setId_usuario(rs.getInt(1));
                    usuarios.setNombre(rs.getString(2));
                    usuarios.setUsuario(rs.getString(3));
                    usuarios.setClave(rs.getString(4));
                    usuarios.setPuesto(rs.getString(5));
                    DBUtil.commit();
                } else {
                    DBUtil.rollback();
                }
                DBUtil.closeDBUtil(rs, stmt, con);
                return usuarios;		
	}
        
        
        
}