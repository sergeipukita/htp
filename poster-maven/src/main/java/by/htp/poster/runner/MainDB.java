package by.htp.poster.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//import com.mysql.jdbc.MySQLConnection;

public class MainDB {
	
	public static void main (String args[]) {
		
		//1.Загрузить драйвер
		//2.Connect to DB
		//3.Выполнить запрос
		//4.Закрыть соединение
		Connection connection = null;
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/affiche", "root", "1234");
			
			Statement st = connection.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM event;");
			
			while (rs.next()) {
				String title = rs.getString("title");
				System.out.println(title);
			}			
			
		} catch (ClassNotFoundException | SQLException e) {
			
			
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
