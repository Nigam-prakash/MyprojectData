import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Delete {
	public static void main(String args[]) throws Exception
	{
		String url="jdbc:mysql://localhost:3306/music_dataset";
		String username= "root";
		String password="21554";
		String Query = "delete from album where album_id=2";
		Connection con = DriverManager.getConnection(url,username,password);
		PreparedStatement psst = con.prepareStatement(Query);
		int row = psst.executeUpdate();
		System.out.println(row);
		con.close();
		
	}

}
