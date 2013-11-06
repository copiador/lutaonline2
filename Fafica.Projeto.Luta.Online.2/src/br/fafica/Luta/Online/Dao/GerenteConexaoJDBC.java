package br.fafica.Luta.Online.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class GerenteConexaoJDBC {

		static String driver = "com.mysql.jdbc.Driver";
	    static String url = "jdbc:mysql://localhost:3306/lutaonline";
	    static String user = "root";
	    static String passw = "";
	    static Connection con;
	    
	    private GerenteConexaoJDBC(){
	            
	    }
	    
	    public static Connection getConexao(){
	        try {
	            Class.forName(driver);
	            con = DriverManager.getConnection(url, user, passw);
	            
	        } catch (Exception e) {
	            e.getMessage();
	        }
	        return con;
	    }

}
