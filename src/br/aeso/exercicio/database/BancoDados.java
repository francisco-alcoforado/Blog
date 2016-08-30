package br.aeso.exercicio.database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BancoDados {
	private String strConnection;
	public BancoDados(String baseType, String Servidor, String baseName) {
		
		this.strConnection = strConnection;
	}

	private Connection connectar(String login, String senha) throws SQLException{
		return DriverManager.getConnection(this.strConnection, login, senha);
	}
	private Connection connectar() throws SQLException{
		return DriverManager.getConnection(this.strConnection, "root", "");
	}
	
	private Connection connectar(String senha) throws SQLException{
		return DriverManager.getConnection(this.strConnection, "root", senha);
	}
	
	public ArrayList<Object> selecionar(String sql) throws SQLException{
	   Connection conn = this.connectar();
	   Statement stmt = conn.createStatement();
	   ResultSet rs = stmt.executeQuery(sql);
	   
	   while(rs.next()){
		   
	   }
	   return null;
	}
}
