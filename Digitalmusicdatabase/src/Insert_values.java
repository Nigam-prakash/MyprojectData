import java.sql.*;
public class Insert_values {
	
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/music_dataset";
		String username = "root";
		String password="21554";
		
		String Query="insert into artist(artist_name,birth_date,country) values('ilaiyaraaja','1943-06-3','India'),('taylorswift','1989-12-13','USA'),('billie eilish','2001-12-18','USA')";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement psst=con.prepareStatement(Query);
		
		int rows=psst.executeUpdate();
		System.out.println(rows);
		con.close();
		
	}

}
