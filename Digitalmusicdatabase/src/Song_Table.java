import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Song_Table {
	public static void main(String args[]) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/music_dataset";
		String username="root";
		String password="21554";
		String Query="create table Album(album_id int primary key auto_increment,album_name varchar(30) not null,release_date int,artist_id int not null,Foreign key (artist_id) references artist(artist_id))";
		Connection con= DriverManager.getConnection(url,username,password);
		PreparedStatement psst=con.prepareStatement(Query);
	    int rows=psst.executeUpdate();
	    System.out.println(rows);
	    con.close();
	    
	    
	}

}
