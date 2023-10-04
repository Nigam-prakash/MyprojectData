import java.sql.*;
public class Insert_secondtable {
	
	public static void main(String args[]) throws Exception
	
	{
		
		String url="jdbc:mysql://localhost:3306/music_dataset";
		String username ="root";
		String password="21554";
		String Query="insert into album(album_name,release_date,artist_id) values('Sagara Sangamam','2004','1'),('Swathi muthyam','1986','1'),('Thalapathi','1991','3'),('jailer','2023','2'),('lover','2023','4'),('what was i made for','2023','5')";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement psst=con.prepareStatement(Query);
		
		int row =psst.executeUpdate();
		System.out.println(row);
		con.close();
	}

}
