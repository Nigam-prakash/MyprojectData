import java.sql.*;
public class Update_table {
	public static void main(String args[]) throws Exception
	{
		
		String url="jdbc:mysql://localhost:3306/music_dataset";
		String username ="root";
		String password="21554";
		String query="update artist set artist_name='anirudh ravichander' where artist_id = '2'";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement psst=con.prepareStatement(query);
		int row = psst.executeUpdate();
		
		System.out.println(row);
		con.close();
	}

}
