import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JDBCTest {
    static void testConnection(Connection conn) throws SQLException {
        DatabaseMetaData data = conn.getMetaData();
        System.out.println(data.getDriverName());
        System.out.println(data.getUserName());
        ItemDAO dao = new ItemDAO(conn);
        System.out.println(dao.searchById(1));
        System.out.println(dao.searchById(2));
        System.out.println(dao.searchByKeyWord("Seal"));
        System.out.println(dao.searchByKeyWord("9"));
//        System.out.println(dao.create(new MusicItem(22, "Drive My Car", "The Beatles")));
    }

    public static void main(String[] args) throws SQLException {
        System.out.println("----------------------------MySQL----------------------------");
        Connection connection = null;
        try {
            String url = "jdbc:mysql://localhost/mysql?serverTimezone=Europe/Moscow";
            connection = DriverManager.getConnection(url, "root", "1234");
            testConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) connection.close();
        }

        System.out.println("\n----------------------------SQLite----------------------------");
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:item.db");
            testConnection(connection);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null) connection.close();
        }
    }
}
