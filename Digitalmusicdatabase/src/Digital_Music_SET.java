import java.sql.*;
public class Digital_Music_SET {

	public static void main(String args[]) throws Exception
	{
		
		String url="jdbc:mysql://localhost:3306/music_dataset";
		String username="root";
		String password="21554";
		String Query="create table artist(artist_id int primary key auto_increment,artist_name varchar(35) not null,birth_date date not null,country varchar(20) not null)";
	    Class.forName("com.mysql.cj.jdbc.Driver");
	    Connection con = DriverManager.getConnection(url,username,password);
	    PreparedStatement psst= con.prepareStatement(Query);
	    psst.executeUpdate();
	    con.close();
	    
	}
}
