import java.sql.*;

public class Join_table{
    public static void main(String args[]) throws Exception {
        String url = "jdbc:mysql://localhost:3306/music_dataset";
        String username = "root";
        String password = "21554";
        String query = "SELECT album_id,album_name FROM album";
        Connection con = DriverManager.getConnection(url, username, password);

        PreparedStatement pstmt = con.prepareStatement(query);
        ResultSet resultSet = pstmt.executeQuery();
        ResultSetMetaData metadata = resultSet.getMetaData();
        int columnCount = metadata.getColumnCount();

        for (int i = 1; i <= columnCount; i++) {
            System.out.print(metadata.getColumnName(i) + "\t");
        }
        System.out.println();

        while (resultSet.next()) {
            for (int i = 1; i <= columnCount; i++) {
                System.out.print(resultSet.getObject(i) + "\t" + " ");
            }
            System.out.println();
        }
    }
}
