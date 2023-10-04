import java.sql.*;
public class Select {
	public static void main(String args[]) throws Exception
	{
		
		String url = "jdbc:mysql://localhost:3306/music_dataset";
		String username= "root";
		String password="21554";
		String Query = "select* from album";
		Connection con = DriverManager.getConnection(url,username,password);
		
		PreparedStatement psst = con.prepareStatement(Query);
		ResultSet resultset = psst.executeQuery();
		ResultSetMetaData metadata = resultset.getMetaData();
		int columncount = metadata.getColumnCount();
		
		for(int i=1;i<=columncount;i++)
		{
			System.out.print(metadata.getColumnName(i) + "   " + "\t");
			
		}
		while(resultset.next())
		{
			for(int i=1;i<=columncount;i++)
			{
				System.out.print(resultset.getObject(i) + "    " + "\t");
			}
			System.out.println();
		}
	}

}
